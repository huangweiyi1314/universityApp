package cdtu.com.school.model.utils;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by huangjie on 2016/4/13.
 */
public class NetConnection {
    public NetConnection(final String serverurl, final netSuccessCallBack successCallBack, final netFailCallBack failCallBack, String... params) {

        StringBuilder paramsBuider = new StringBuilder();
        for (int i = 0; i < params.length; i++) {
            paramsBuider.append(params[i]);
        }
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                try {
                    URL url = new URL("http://ipoter.cn/lifeapp/"+serverurl+"?from=e73aa629aa9d40e8b7073ee8f7f0d58e");
                    URLConnection connection = url.openConnection();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String line;
                    StringBuilder result = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        result.append(line);
                    }
                    return result.toString();

                } catch (Exception e) {
                    e.printStackTrace();
                    if (failCallBack != null)
                        failCallBack.Failed();
                    return null;
                }


            }

            @Override
            protected void onPostExecute(String s) {
                if (s != null) {
                    if (successCallBack != null)
                        successCallBack.Success(s);
                } else {
                    if (failCallBack != null)
                        failCallBack.Failed();
                }

            }
        }.execute();
    }

    /**
     * 访问服务器成功回调接口
     */
    public interface netSuccessCallBack {
        public void Success(String result);
    }

    /**
     * 访问服务器失败回调接口
     */
    public interface netFailCallBack {
        public void Failed();
    }

}
