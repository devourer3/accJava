package com.gibeom.accountbookjava;



import com.gibeom.accountbookjava.di.ApplicationComponent;
import com.gibeom.accountbookjava.di.DaggerApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import timber.log.Timber;

public class AccApp extends DaggerApplication {

  @Override
  public void onCreate() {
    super.onCreate();
    if(BuildConfig.DEBUG)
      Timber.plant(new Timber.DebugTree());
  }

  @Override
  protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
    ApplicationComponent component = DaggerApplicationComponent.builder().application(this).build();
    component.inject(this);
    return component;
  }

}
