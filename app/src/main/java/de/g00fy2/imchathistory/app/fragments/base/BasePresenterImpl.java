package de.g00fy2.imchathistory.app.fragments.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

public abstract class BasePresenterImpl implements BasePresenter {

  private CompositeDisposable compositeSubscription;

  @Override public void bind(Disposable subscription) {
    if (compositeSubscription != null) {
      compositeSubscription.add(subscription);
    }
  }

  @Override public void onCreate() {
  }

  @Override public void onResume() {
    compositeSubscription = new CompositeDisposable();
  }

  @Override public void onPause() {
    if (compositeSubscription != null) {
      compositeSubscription.dispose();
      compositeSubscription.clear();
    }
  }
}
