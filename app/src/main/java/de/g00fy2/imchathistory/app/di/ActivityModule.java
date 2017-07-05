package de.g00fy2.imchathistory.app.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import de.g00fy2.imchathistory.app.Navigator;
import de.g00fy2.imchathistory.app.activities.BaseActivity;
import de.g00fy2.imchathistory.app.annotations.PerActivity;

/**
 * Created by Thomas Wirth on 20.05.2017.
 */

@Module public class ActivityModule {

  private BaseActivity baseActivity;

  public ActivityModule(BaseActivity baseActivity) {
    this.baseActivity = baseActivity;
  }

  @Provides @PerActivity BaseActivity provideBaseActivity() {
    return baseActivity;
  }

  @Provides @PerActivity Context provideContext() {
    return baseActivity;
  }

  @Provides @PerActivity Navigator provideNavigator() {
    return new Navigator(baseActivity);
  }
}
