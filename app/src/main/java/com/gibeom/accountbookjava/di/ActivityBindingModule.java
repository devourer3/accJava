package com.gibeom.accountbookjava.di;

import com.gibeom.accountbookjava.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBindingModule {

  @ContributesAndroidInjector
  abstract MainActivity bindMainActivity();

}
