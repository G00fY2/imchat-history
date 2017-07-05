package de.g00fy2.imchathistory.app.fragments.start;

import de.g00fy2.imchathistory.app.fragments.base.BasePresenterImpl;
import de.g00fy2.imchathistory.model.controllers.AssetController;
import javax.inject.Inject;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

public class StartPresenterImpl extends BasePresenterImpl implements
    de.g00fy2.imchathistory.app.fragments.start.StartPresenter {

  @Inject StartFragment view;
  @Inject AssetController assetController;

  @Override public void onResume() {
    super.onResume();
  }

  @Override public void onStop() {
    super.onStop();
  }

  @Override public int countHTMLFiles(String path) {
    //return assetController.countHTMLFiles(path);
    return 0;
  }
}
