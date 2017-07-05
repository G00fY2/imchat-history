package de.g00fy2.imchathistory.app.di;

import dagger.Module;
import dagger.Provides;
import de.g00fy2.imchathistory.app.annotations.PerActivity;
import de.g00fy2.imchathistory.model.controllers.AssetController;
import de.g00fy2.imchathistory.model.controllers.AssetControllerImpl;

/**
 * Created by Thomas Wirth on 20.05.2017.
 */

@Module public class ControllerModule {

    @Provides @PerActivity AssetController provideAssetController(AssetControllerImpl assetControllerImpl) {
        return assetControllerImpl;
    }
}
