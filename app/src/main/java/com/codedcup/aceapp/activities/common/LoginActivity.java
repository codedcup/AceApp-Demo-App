package com.codedcup.aceapp.activities.common;

import android.content.Intent;

import com.codedcup.aceapp.activities.faculty.FacultyDashboardActivity;
import com.codedcup.aceapp.activities.student.StudentDashboardActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

import com.codedcup.aceapp.R;
import com.codedcup.aceapp.utils.Util;

public class LoginActivity extends BaseActivity {
    private TextInputLayout emailLayout;
    private TextInputLayout passwordLayout;
    private TextInputEditText email;
    private TextInputEditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailLayout = findViewById(R.id.activity_login_email_layout);
        passwordLayout = findViewById(R.id.activity_login_password_layout);
        email = findViewById(R.id.activity_login_email);
        password = findViewById(R.id.activity_login_password);
        TextView createNewAccount = findViewById(R.id.activity_login_signup);

        findViewById(R.id.activity_login_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){
                    application.getAuth().getSession().setLoggedIn(true);
                    startActivity(new Intent(LoginActivity.this, StudentDashboardActivity.class));
                    finish();
                }
            }
        });

        createNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, UserTypeActivity.class));
            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailLayout.setErrorEnabled(false);
                emailLayout.setError("");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                passwordLayout.setErrorEnabled(false);
                passwordLayout.setError("");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private boolean validate() {
        if(!email.getText().toString().matches(Util.emailRegex) || email.getText().toString().trim().equals("")){
            emailLayout.setErrorEnabled(true);
            emailLayout.setError("Enter your email");
        }else if(password.getText().toString().trim().equals("")){
            passwordLayout.setErrorEnabled(true);
            passwordLayout.setError("Enter your password");
        }else {
            return true;
        }
        return false;
    }
}