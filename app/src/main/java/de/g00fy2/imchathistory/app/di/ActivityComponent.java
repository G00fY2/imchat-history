package de.g00fy2.imchathistory.app.di;

import android.content.Context;
import dagger.Component;
import de.g00fy2.imchathistory.app.Navigator;
import de.g00fy2.imchathistory.app.activities.BaseActivity;
import de.g00fy2.imchathistory.app.annotations.PerActivity;
import de.g00fy2.imchathistory.model.controllers.AssetController;

/**
 * Created by Thomas Wirth on 20.05.2017.
 */

@PerActivity
@Component(modules = {ActivityModule.class, ControllerModule.class}, dependencies = ApplicationComponent.class)
public interface ActivityComponent {

    BaseActivity baseActivity();

    Context context();

    Navigator navigator();

    AssetController assetController();
}
