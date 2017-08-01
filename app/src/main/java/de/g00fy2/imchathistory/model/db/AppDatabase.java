package de.g00fy2.imchathistory.model.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import de.g00fy2.imchathistory.model.db.converter.DateConverter;
import de.g00fy2.imchathistory.model.db.dao.ChatConversationDao;
import de.g00fy2.imchathistory.model.db.entity.ChatConversation;

/**
 * Created by Thomas Wirth on 01.08.2017.
 */

@Database(entities = {ChatConversation.class}, version = 1)
@TypeConverters(DateConverter.class)
public abstract class AppDatabase extends RoomDatabase {
  public abstract ChatConversationDao chatConversationDao();
}