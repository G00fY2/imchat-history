package de.g00fy2.imchathistory.app.fragments.start;

import de.g00fy2.imchathistory.app.fragments.base.BasePresenterImpl;
import de.g00fy2.imchathistory.model.controllers.AssetController;
import javax.inject.Inject;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

public class StartPresenterImpl extends BasePresenterImpl implements StartContract.StartPresenter {

  @Inject StartContract.StartView view;

  @Inject AssetController assetController;

  @Inject public StartPresenterImpl() {

  }

  @Override public void onResume() {
    super.onResume();

    String filePath = "jj_tw_history";
    countHTMLFiles(filePath);
  }

  @Override public void countHTMLFiles(String path) {
    bind(assetController.countHTMLFiles(path)
        .subscribe(view::setCountText, Throwable::printStackTrace));
  }
}
