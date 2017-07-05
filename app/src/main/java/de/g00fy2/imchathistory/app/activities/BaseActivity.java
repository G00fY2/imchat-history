package de.g00fy2.imchathistory.app.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import de.g00fy2.imchathistory.R;
import de.g00fy2.imchathistory.app.MyApplication;
import de.g00fy2.imchathistory.app.Navigator;
import de.g00fy2.imchathistory.app.annotations.Layout;
import de.g00fy2.imchathistory.app.di.ActivityComponent;
import de.g00fy2.imchathistory.app.di.ActivityModule;
import de.g00fy2.imchathistory.app.di.DaggerActivityComponent;
import java.lang.annotation.Annotation;

/**
 * Created by Thomas Wirth on 20.05.2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

  protected ActivityComponent activityComponent;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ButterKnife.bind(this);
    initializeInjector();
  }

  @Override protected void onDestroy() {
    super.onDestroy();
  }

  private void initializeInjector() {
    activityComponent = DaggerActivityComponent.builder()
        .applicationComponent(((MyApplication) getApplication()).getApplicationComponent())
        .activityModule(new ActivityModule(this))
        .build();
  }

  public ActivityComponent getActivityComponent() {
    return activityComponent;
  }

  public int getFragmentContainerId() {
    return R.id.fragmentContainer;
  }

  public Navigator getNavigator() {
    return activityComponent.navigator();
  }

  private int getLayoutResId() {
    Annotation annotation = this.getClass().getAnnotation(Layout.class);
    if (annotation != null) {
      return ((Layout) annotation).value();
    } else {
      throw new IllegalStateException("You must provide a layout via the @Layout annotation");
    }
  }
}
