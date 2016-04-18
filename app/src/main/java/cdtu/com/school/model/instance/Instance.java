package cdtu.com.school.model.instance;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import cdtu.com.school.R;
import cdtu.com.school.model.utils.DbOpenHelper;

/**
 * Created by huangjie on 2016/4/14.
 */
public class Instance {
    public static int[] VIEWPAGER_IMAGE = new int[]{R.drawable.img,R.drawable.img,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6};
    public static int ATY_INDEX_VIEWPAGER_COUNT = 3;
    public  static int  INDEX_LEFT_VIEW_FLAG=1;
    public static String DB_NAME = "school_db";
    public static String TABLE_NAME = "school";
    public static int DB_VERSON = 1;
    public static String DB_COLOUM_CITY = "city";
    public static String DB_COLOUM_UNIVERSITY = "university";
    public static String DB_CREATE_UNIVERSITY_TABLE =
            "create table school(_id integer primary key autoincrement, " +
                    "text" + DB_COLOUM_CITY + "," +
                    "text " + DB_COLOUM_UNIVERSITY + ")";

    /**
     * 往数据库里面添加数据
     */
    public static void addUnisersityDb(String city, String university) {
        SQLiteDatabase database = new DbOpenHelper(Instance.DB_NAME, Instance.DB_VERSON).getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Instance.DB_COLOUM_CITY, city);
        values.put(Instance.DB_COLOUM_UNIVERSITY, university);
        database.insert(Instance.TABLE_NAME, null, values);
        database.close();
    }

    /**
     * 录入数据
     */
    public static void insertToDb() {
        SQLiteDatabase database = new DbOpenHelper(Instance.DB_NAME, Instance.DB_VERSON).getWritableDatabase();
        database.execSQL("INSERT INTO school  VALUES('1','成都市','四川大学')");
        database.execSQL("INSERT INTO school VALUES('2','成都市','成都工业学院')");
        database.execSQL("INSERT INTO school VALUES('3','成都市','电子科技大学')");
        database.execSQL("INSERT INTO school VALUES('4','成都市','西南石油大学')");
        database.execSQL("INSERT INTO school VALUES('5','成都市','成都理工大学')");
        database.execSQL("INSERT INTO school VALUES ('6','成都市','成都大学')");
        database.execSQL("INSERT INTO school VALUES('7','成都市','成都信息工程大学')");
       /* database.execSQL("INSERT INTO school VALUES('成都市','四川师范大学')");
        database.execSQL("INSERT INTO school VALUES('成都市','成都中医药大学')");
        database.execSQL("INSERT INTO school VALUES('成都市','西南财经大学')");
        database.execSQL("INSERT INTO school VALUES('成都市','成都体育学院')");
        database.execSQL("INSERT INTO school VALUES('成都市','四川音乐学院')");
        database.execSQL("INSERT INTO school VALUES('成都市','西南名族大学')");
        database.execSQL("INSERT INTO school VALUES('成都市','四川旅游学院')");
        database.execSQL("INSERT INTO school VALUES('成都市','成都东软学院')");
        database.execSQL("INSERT INTO school VALUES('成都市','电子科技大学成都学院')");
        database.execSQL("INSERT INTO school VALUES('成都市','四川传媒学院')");
        database.execSQL("INSERT INTO school VALUES('成都市','成都信息工程大学银杏酒店管理学院')");
        database.execSQL("INSERT INTO school VALUES('成都市','四川大学')");
        database.execSQL("INSERT INTO school VALUES('成都市','四川大学')");
        database.execSQL("INSERT INTO school VALUES('成都市','四川大学')");
        database.execSQL("INSERT INTO school VALUES('成都市','四川大学')");*/
        database.close();
    }

}
