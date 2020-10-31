package com.codedcup.aceapp.infrastructure;

import android.app.Application;

public class AceApp extends Application{

  private Auth auth;

  @Override
  public void onCreate() {
    super.onCreate();
    auth = new Auth(this);
  }

  public Auth getAuth(){
    return auth;
  }
}