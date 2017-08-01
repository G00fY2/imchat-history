package de.g00fy2.imchathistory.model.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import java.util.Date;

/**
 * Created by Thomas Wirth on 01.08.2017.
 */

@Entity(tableName = "chatconversations")
public class ChatConversation {

  @PrimaryKey(autoGenerate = true)
  private int uid;

  private Date date;
  private String title;
  private String body;

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }
}
