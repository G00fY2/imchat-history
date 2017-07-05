package de.g00fy2.imchathistory.model.controllers;

import android.content.Context;
import java.io.IOException;
import javax.inject.Inject;

/**
 * Created by Thomas Wirth on 20.05.2017.
 */

public class AssetControllerImpl implements AssetController {

  @Inject Context context;

  @Inject public AssetControllerImpl() {
  }

  @Override public int countHTMLFiles(String folder) {

    int count = 0;
    try {
      count = context.getAssets().list(folder).length;
    } catch (IOException e) {
      e.printStackTrace();
    }

    return count;
  }
}
