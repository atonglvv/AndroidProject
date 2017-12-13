package com.example.innovation.aaproject.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by LvTong on 2017/12/11 21:40
 * E-Mail Address：lt1550919167@163.com
 */

public class BillDBHelper extends SQLiteOpenHelper {

    public static final int VERSION = 1;
    public static final String NAME = "bill";

    public BillDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table bill (" +
                "id integer primary key autoincrement," +
                "title varchar," +
                ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
