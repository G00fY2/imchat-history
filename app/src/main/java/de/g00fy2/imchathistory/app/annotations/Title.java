package de.g00fy2.imchathistory.app.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.TYPE) public @interface Title {
  int value();
}