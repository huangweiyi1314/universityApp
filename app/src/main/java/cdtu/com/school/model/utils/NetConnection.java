package cdtu.com.school.model.utils;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

/**
 * Created by huangjie on 2016/4/13.
 */
public class NetConnection {
    public NetConnection(final String url, final HttpMethod method,
                         final netSuccessCallBack successCallBack, final netFailCallBack failCallBack,
                         Map<String, String> pars) {
        final StringBuilder paramsBuider = new StringBuilder();

        Set<String> keys = pars.keySet();
        for (String key : keys) {
            paramsBuider.append(key + "=" + pars.get(key) + "&");
        }
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                try {

                    URLConnection connection = null;
                    switch (method) {
                        case POST:
                            connection = new URL(url).openConnection();
                            connection.setDoOutput(true);
                            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
                            writer.write(paramsBuider.toString());
                            writer.flush();
                            break;
                        default:
                            //connection =

                    }

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
