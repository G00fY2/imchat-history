package de.g00fy2.imchathistory.app.di;

import dagger.Component;
import de.g00fy2.imchathistory.app.MyApplication;
import javax.inject.Singleton;

/**
 * Created by Thomas Wirth on 20.05.2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    MyApplication application();
}
