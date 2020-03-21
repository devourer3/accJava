package com.gibeom.accountbookjava;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class MainViewModel extends ViewModel {

  private MainRepository repository;
  private CompositeDisposable disposable;

  @Inject
  public MainViewModel(MainRepository repository) {
    this.repository = repository;
    disposable = new CompositeDisposable();
  }


  private void fetchAll(String query) {
    repository.query(query);
  }

  @Override
  protected void onCleared() {
    super.onCleared();
    if (disposable != null) {
      disposable.clear();
      disposable = null;
    }
  }
}
