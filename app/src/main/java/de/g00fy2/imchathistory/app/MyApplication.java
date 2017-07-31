package de.g00fy2.imchathistory.app;

import android.app.Application;
import de.g00fy2.imchathistory.app.di.ApplicationComponent;
import de.g00fy2.imchathistory.app.di.ApplicationModule;
import de.g00fy2.imchathistory.app.di.DaggerApplicationComponent;
import timber.log.Timber;

/**
 * Created by Thomas Wirth on 19.05.2017.
 */

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        //setup Timber TODO only when debug
        Timber.plant(new Timber.DebugTree());
        initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

}
