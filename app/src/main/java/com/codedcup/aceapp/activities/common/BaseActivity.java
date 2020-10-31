package com.codedcup.aceapp.activities.common;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.codedcup.aceapp.infrastructure.AceApp;

public abstract class BaseActivity extends AppCompatActivity {
    protected AceApp application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (AceApp) getApplication();
    }
}