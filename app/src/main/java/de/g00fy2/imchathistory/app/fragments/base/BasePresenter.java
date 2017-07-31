package de.g00fy2.imchathistory.app.fragments.base;

import io.reactivex.disposables.Disposable;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

public interface BasePresenter {

  void bind(Disposable subscription);

  void onCreate();

  void onResume();

  void onPause();

}
