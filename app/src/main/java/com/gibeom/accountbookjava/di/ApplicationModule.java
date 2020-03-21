package com.gibeom.accountbookjava.di;

import com.gibeom.accountbookjava.AccApp;
import com.gibeom.accountbookjava.data.local.DatabaseHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = ViewModelModule.class)
public class ApplicationModule {
  @Singleton
  @Provides
  DatabaseHelper provideDatabaseHelper(AccApp accApp) {
    return new DatabaseHelper(accApp);
  }
}
