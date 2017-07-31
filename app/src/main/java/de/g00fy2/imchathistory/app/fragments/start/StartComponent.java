package de.g00fy2.imchathistory.app.fragments.start;

import dagger.Component;
import de.g00fy2.imchathistory.app.annotations.PerFragment;
import de.g00fy2.imchathistory.app.di.ActivityComponent;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

@PerFragment @Component(dependencies = ActivityComponent.class, modules = StartModule.class)
public interface StartComponent {

  void inject(StartFragment view);

  void inject(StartPresenterImpl presenter);
}
