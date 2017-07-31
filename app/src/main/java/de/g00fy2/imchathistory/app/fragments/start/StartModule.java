package de.g00fy2.imchathistory.app.fragments.start;

import dagger.Module;
import dagger.Provides;
import de.g00fy2.imchathistory.app.annotations.PerFragment;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

@PerFragment @Module public class StartModule {

  private StartContract.StartView view;
  private StartContract.StartPresenter presenter;

  public StartModule(StartContract.StartView view, StartContract.StartPresenter presenter){
    this.view = view;
    this.presenter = presenter;
  }

  @Provides @PerFragment StartContract.StartView provideView() {
    return view;
  }

  @Provides @PerFragment StartContract.StartPresenter providePresenter() {
    return presenter;
  }

}
