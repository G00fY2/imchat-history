package de.g00fy2.imchathistory.model.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import de.g00fy2.imchathistory.model.db.entity.ChatConversation;
import java.util.List;

/**
 * Created by Thomas Wirth on 01.08.2017.
 */

@Dao
public interface ChatConversationDao {

  @Query("SELECT * FROM chatconversations")
  List<ChatConversation> getAll();

  @Query("SELECT * FROM chatconversations WHERE uid IN (:userIds)")
  List<ChatConversation> loadAllByIds(int[] userIds);

  @Insert
  void insertAll(ChatConversation... chatConversations);

  @Delete
  void delete(ChatConversation chatConversations);

}
