package com.gibeom.accountbookjava.di;

import android.app.Application;
import android.content.Context;

import com.gibeom.accountbookjava.AccApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        AndroidInjectionModule.class,
        ActivityBindingModule.class})
public interface ApplicationComponent extends AndroidInjector<DaggerApplication> {

  void inject(AccApp application);

  @Component.Builder
  interface Builder {
    @BindsInstance
    Builder application(Application application);

    ApplicationComponent build();
  }

//  @Component.Factory
//  interface Factory {
//    ApplicationComponent create(@BindsInstance Context applicationContext);
//  }
}
