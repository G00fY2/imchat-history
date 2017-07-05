package de.g00fy2.imchathistory.app.fragments.base;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

public interface BaseView {

  void setupToolbar();

  void initializeViews();

  boolean onBackPressed();
}
