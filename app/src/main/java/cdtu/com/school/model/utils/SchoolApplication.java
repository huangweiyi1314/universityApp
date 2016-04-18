package cdtu.com.school.model.utils;

import android.app.Application;
import android.content.Context;

/**
 * Created by huangjie on 2016/4/13.
 */
public class SchoolApplication extends Application {
    private static Context montext;
    @Override
    public void onCreate() {
        super.onCreate();
        montext = getApplicationContext();
    }
    public static Context getContext(){
        return  montext;
    }
}
