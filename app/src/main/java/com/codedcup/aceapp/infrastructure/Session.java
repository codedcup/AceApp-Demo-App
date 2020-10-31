package com.codedcup.aceapp.infrastructure;

import android.content.Context;
import android.content.SharedPreferences;

import java.security.KeyStore;

public class Session {

    private SharedPreferences preferences;

    Session(Context context)
    {
        preferences = context.getSharedPreferences("session", Context.MODE_PRIVATE);
    }

    public boolean isLoggedIn() {
        return preferences.getBoolean("isLoggedIn", false);
    }

    public void setLoggedIn(boolean loggedIn) {
        preferences.edit().putBoolean("isLoggedIn", loggedIn).apply();
    }
}