package com.codedcup.aceapp.activities.common;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.codedcup.aceapp.R;
import com.codedcup.aceapp.activities.admin.AdminDashboardActivity;
import com.codedcup.aceapp.activities.faculty.FacultyDashboardActivity;
import com.codedcup.aceapp.activities.parent.ParentDashboardActivity;
import com.codedcup.aceapp.activities.parent.ParentSignupActivity;
import com.codedcup.aceapp.activities.student.StudentSignupActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, FacultyDashboardActivity.class));
                finish();
            }
        }, 2500);
    }
}