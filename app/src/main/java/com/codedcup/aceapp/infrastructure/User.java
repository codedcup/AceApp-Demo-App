package com.codedcup.aceapp.infrastructure;

import android.content.Context;
import android.content.SharedPreferences;

public class User {

    private Context context;
    private SharedPreferences preferences;

    public User(Context context)
    {
        this.context = context;
        preferences = context.getSharedPreferences("user", Context.MODE_PRIVATE);
    }
}