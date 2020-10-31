package com.codedcup.aceapp.activities.common;

import android.content.Intent;
import android.os.Bundle;

public abstract class BaseAuthenticationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);

        if(!application.getAuth().getSession().isLoggedIn()){
            startActivity(new Intent(BaseAuthenticationActivity.this, LoginActivity.class));
            finish();
            return;
        }

        OnAppCreate(savedState);
    }

    protected abstract void OnAppCreate(Bundle savedState);
}
