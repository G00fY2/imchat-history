package de.g00fy2.imchathistory.model.controllers;

import io.reactivex.Single;

/**
 * Created by Thomas Wirth on 20.05.2017.
 */

public interface AssetController {

    Single<Integer> countHTMLFiles(String folder);
}
