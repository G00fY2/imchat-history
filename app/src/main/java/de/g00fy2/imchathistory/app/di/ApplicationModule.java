package de.g00fy2.imchathistory.app.di;

import dagger.Module;
import dagger.Provides;
import de.g00fy2.imchathistory.app.MyApplication;
import javax.inject.Singleton;

/**
 * Created by Thomas Wirth on 20.05.2017.
 */

@Module
public class ApplicationModule {

    private de.g00fy2.imchathistory.app.MyApplication MyApplication;

    public ApplicationModule(MyApplication MyApplication) {
        this.MyApplication = MyApplication;
    }

    @Provides @Singleton MyApplication provideApplication() {
        return MyApplication;
    }
}
