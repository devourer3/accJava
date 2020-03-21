package com.gibeom.accountbookjava;

import com.gibeom.accountbookjava.data.local.DatabaseHelper;

import javax.inject.Inject;

public class MainRepository {

  @Inject
  DatabaseHelper databaseHelper;

  public void query(String query) {
    this.databaseHelper.getWritableDatabase().execSQL(query);
  }

}
