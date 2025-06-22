package com.s22010422.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "DOB.db";
    public static final String TABLE_NAME = "blood_form";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Fname";
    public static final String COL_3 = "Age";
    public static final String COL_4 = "Dbirth";
    public static final String COL_5 = "Phone";
    public static final String COL_6 = "Email";
    public static final String COL_7 = "Address";
    public static final String COL_8 = "City";
    public static final String COL_9 = "Btype";
    public static final String COL_10 = "Term";
    public static final String COL_11 = "Ill";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        // SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, "+ "FNAME TEXT, AGE INTEGER, DBIRTH TEXT, PHONE TEXT, EMAIL TEXT, ADDRESS TEXT, CITY TEXT, BTYPE TEXT, TERM TEXT, ILL TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);

    }

    public boolean insertData(String fname, String age, String dbirth, String phone, String email, String address, String city, String btype, String term, String ill){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,fname);
        contentValues.put(COL_3,age);
        contentValues.put(COL_4,dbirth);
        contentValues.put(COL_5,phone);
        contentValues.put(COL_6,email);
        contentValues.put(COL_7,address);
        contentValues.put(COL_8,city);
        contentValues.put(COL_9,btype);
        contentValues.put(COL_10,term);
        contentValues.put(COL_11,ill);

        db.insert(TABLE_NAME, null,contentValues);
    }
}
