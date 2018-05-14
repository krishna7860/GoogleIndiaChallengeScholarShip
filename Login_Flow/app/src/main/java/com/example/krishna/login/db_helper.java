package com.example.krishna.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class db_helper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="users_data.db";
    private static final int DATABASE_VERSION=1;

    public db_helper(Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String DB_CREATE_SQL_QUERY="CREATE TABLE "+
        database_contract.database_entry.TABLE_NAME + "("+
        database_contract.database_entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
        database_contract.database_entry.USER_NAME + " TEXT NOT NULL, "+
        database_contract.database_entry.USER_FIRST_NAME + " TEXT NOT NULL, "+
        database_contract.database_entry.USER_EMAIL + " TEXT NOT NULL, "+
        database_contract.database_entry.USER_PASSWORD + " TEXT NOT NULL "+
                ");";

        db.execSQL(DB_CREATE_SQL_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
