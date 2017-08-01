package de.g00fy2.imchathistory.model.db.converter;

import android.arch.persistence.room.TypeConverter;
import java.util.Date;

/**
 * Created by Thomas Wirth on 01.08.2017.
 */

public class DateConverter {
  @TypeConverter
  public static Date toDate(Long timestamp) {
    return timestamp == null ? null : new Date(timestamp);
  }

  @TypeConverter
  public static Long toTimestamp(Date date) {
    return date == null ? null : date.getTime();
  }
}