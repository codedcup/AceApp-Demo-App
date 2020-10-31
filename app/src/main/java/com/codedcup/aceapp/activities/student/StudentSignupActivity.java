package com.codedcup.aceapp.activities.student;

import android.content.Intent;

import com.codedcup.aceapp.activities.common.BaseActivity;
import com.codedcup.aceapp.activities.common.LoginActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.codedcup.aceapp.R;
import com.codedcup.aceapp.utils.Util;

public class StudentSignupActivity extends BaseActivity {

    private TextInputLayout nameLayout;
    private TextInputLayout enrollLayout;
    private TextInputLayout emailLayout;
    private TextInputLayout phoneLayout;
    private TextInputLayout passwordLayout;
    private TextInputLayout confirmPasswordLayout;
    private TextInputEditText name;
    private TextInputEditText enroll;
    private TextInputEditText email;
    private TextInputEditText phone;
    private TextInputEditText password;
    private TextInputEditText confirmPassword;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_student_signup);

        nameLayout = findViewById(R.id.activity_student_signup_name_layout);
        enrollLayout = findViewById(R.id.activity_student_signup_enroll_layout);
        emailLayout = findViewById(R.id.activity_student_signup_email_layout);
        phoneLayout = findViewById(R.id.activity_student_signup_phone_layout);
        passwordLayout = findViewById(R.id.activity_student_signup_password_layout);
        confirmPasswordLayout = findViewById(R.id.activity_student_signup_confirm_password_layout);
        name = findViewById(R.id.activity_student_signup_name);
        enroll = findViewById(R.id.activity_student_signup_enroll);
        email = findViewById(R.id.activity_student_signup_email);
        phone = findViewById(R.id.activity_student_signup_phone);
        password = findViewById(R.id.activity_student_signup_password);
        confirmPassword = findViewById(R.id.activity_student_signup_confirm_password);

        findViewById(R.id.activity_student_signup_create).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate()) {
                    startActivity(new Intent(StudentSignupActivity.this, LoginActivity.class));
                    finish();
                }
            }
        });

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                nameLayout.setErrorEnabled(false);
                nameLayout.setError("");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        enroll.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                enrollLayout.setErrorEnabled(false);
                enrollLayout.setError("");
            }

            @Override
            public void afterTextChanged(Editable s) {

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
        phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                phoneLayout.setErrorEnabled(false);
                phoneLayout.setError("");
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
        confirmPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                confirmPasswordLayout.setErrorEnabled(false);
                confirmPasswordLayout.setError("");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private boolean validate() {
        if(name.getText().toString().trim().equals("")){
            nameLayout.setErrorEnabled(true);
            nameLayout.setError("Name required");
        }else if(enroll.getText().toString().trim().equals("")){
            enrollLayout.setErrorEnabled(true);
            enrollLayout.setError("Enroll number required");
        }else if(!email.getText().toString().matches(Util.emailRegex) || email.getText().toString().trim().equals("")){
            emailLayout.setErrorEnabled(true);
            emailLayout.setError("Email required");
        }else if(phone.getText().toString().length() < 10){
            phoneLayout.setErrorEnabled(true);
            phoneLayout.setError("Phone number required");
        }else if(password.getText().toString().trim().length() < 8){
            passwordLayout.setErrorEnabled(true);
            passwordLayout.setError("Password should contain 8-16 characters");
        }else if(confirmPassword.getText().toString().equals(password.getText().toString())){
            confirmPasswordLayout.setErrorEnabled(true);
            confirmPasswordLayout.setError("Password doesn't match");
        }else {
            return true;
        }
        return false;
    }
}
