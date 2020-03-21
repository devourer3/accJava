package com.gibeom.accountbookjava.data.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

  private static final int DATABASE_VERSION = 1;

  public DatabaseHelper(@Nullable Context context) {
    super(context, "acc.db", null, DATABASE_VERSION);
  }

  @Override
  public void onCreate(SQLiteDatabase sqLiteDatabase) {
    String createTable =
            "CREATE TABLE db" +
                    "(" +
                    "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                    "title TEXT NOT NULL DEFAULT \"\"," +
                    "money INTEGER NOT NULL DEFAULT 0," +
                    "type INTEGER NOT NULL DEFAULT 0" +
                    ")";

    sqLiteDatabase.execSQL(createTable);
//    "CREATE TABLE account " +
//            "(id integer primary key autoincrement," +
//            "";
  }

  @Override
  public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

  }
}