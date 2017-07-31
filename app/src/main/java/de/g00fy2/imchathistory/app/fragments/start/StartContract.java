package de.g00fy2.imchathistory.app.fragments.start;

import de.g00fy2.imchathistory.app.fragments.base.BasePresenter;
import de.g00fy2.imchathistory.app.fragments.base.BaseView;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

public interface StartContract {

  interface StartPresenter extends BasePresenter {

     void countHTMLFiles(String path);

  }

  interface StartView extends BaseView {

    void setCountText(int counter);
  }

}
