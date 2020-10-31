package com.codedcup.aceapp.infrastructure;

import android.content.Context;

public class Auth{
  private final Context context;
  private User user;
  private Session session;

  public Auth(Context context) {
    this.context = context;
    user = new User(context);
    session = new Session(context);
  }

  public User getUser() {
    return user;
  }

  public Session getSession(){
    return session;
  }
}