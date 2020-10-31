package com.codedcup.aceapp.activities.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.codedcup.aceapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class AddStudentActivity extends AppCompatActivity {

    private TextInputLayout nameLayout;
    private TextInputLayout enrollLayout;
    private TextInputLayout phoneLayout;
    private TextInputLayout emailLayout;
    private TextInputLayout yearLayout;
    private TextInputLayout semesterLayout;
    private TextInputLayout branchLayout;
    private TextInputEditText name;
    private TextInputEditText enroll;
    private TextInputEditText phone;
    private TextInputEditText email;
    private TextInputEditText year;
    private TextInputEditText semester;
    private TextInputEditText branch;
    private Button button ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        nameLayout=findViewById(R.id.activity_add_student_name_layout);
        enrollLayout=findViewById(R.id.activity_add_student_enroll_layout);
        phoneLayout=findViewById(R.id.activity_add_student_phone_layout);
        emailLayout=findViewById(R.id.activity_add_student_email_layout);
        yearLayout=findViewById(R.id.activity_add_student_year_layout);
        semesterLayout=findViewById(R.id.activity_add_student_semester_layout);
        branchLayout=findViewById(R.id.activity_add_student_branch_layout);
        name=findViewById(R.id.activity_add_student_name);
        enroll=findViewById(R.id.activity_add_student_enroll);
        phone=findViewById(R.id.activity_add_student_phone);
        email=findViewById(R.id.activity_add_student_email);
        year=findViewById(R.id.activity_add_student_year);
        semester=findViewById(R.id.activity_add_student_semester);
        branch=findViewById(R.id.activity_add_student_branch);
        button=findViewById(R.id.activity_add_student_addStudent);
    }
}
