package de.g00fy2.imchathistory.app;

import android.support.v4.app.Fragment;
import de.g00fy2.imchathistory.app.activities.BaseActivity;
import de.g00fy2.imchathistory.app.fragments.start.DaggerStartComponent;
import de.g00fy2.imchathistory.app.fragments.start.StartComponent;
import de.g00fy2.imchathistory.app.fragments.start.StartContract;
import de.g00fy2.imchathistory.app.fragments.start.StartFragment;
import de.g00fy2.imchathistory.app.fragments.start.StartModule;
import de.g00fy2.imchathistory.app.fragments.start.StartPresenter;
import de.g00fy2.imchathistory.app.fragments.start.StartPresenterImpl;

/**
 * Created by Thomas Wirth on 21.05.2017.
 */

public class Navigator {

  private BaseActivity baseActivity;

  public Navigator(BaseActivity baseActivity) {
    this.baseActivity = baseActivity;
  }

  public void showStartFragment() {
    StartContract fragment = new StartFragment();
    StartPresenter presenter = new StartPresenterImpl();

    StartComponent component = DaggerStartComponent.builder()
        .activityComponent(baseActivity.getActivityComponent())
        .startModule(new StartModule(fragment, presenter))
        .build();

    component.inject(fragment);
    component.inject(presenter);

    transist((Fragment) fragment);

  }

  private void transist(Fragment fragment) {
    baseActivity.getSupportFragmentManager()
        .beginTransaction()
        .replace(baseActivity.getFragmentContainerId(), fragment, fragment.getClass().getName())
        .addToBackStack(fragment.getClass().getName())
        .commit();
  }
}
