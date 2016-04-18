package cdtu.com.school.model.utils;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import cdtu.com.school.model.instance.Instance;

/**
 * Created by huangjie on 2016/4/14.
 */
public class DbOpenHelper extends SQLiteOpenHelper {
    public DbOpenHelper( String name,int version) {
        super(SchoolApplication.getContext(), name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL(Instance.DB_CREATE_UNIVERSITY_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
