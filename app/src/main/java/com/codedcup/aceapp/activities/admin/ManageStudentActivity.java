package com.codedcup.aceapp.activities.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.codedcup.aceapp.R;
import com.codedcup.aceapp.activities.student.StudentSignupActivity;

public class ManageStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_student);
        CardView addCard = findViewById(R.id.activity_manage_student_addStudent);
        CardView removeCard = findViewById(R.id.activity_manage_student_removeStudent);
        CardView editCard = findViewById(R.id.activity_manage_student_editStudent);

        addCard.setOnClickListener(listener);
        removeCard.setOnClickListener(listener);
        editCard.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id){
                case R.id.activity_manage_student_addStudent: startActivity(new Intent(ManageStudentActivity.this, AddStudentActivity.class));
                    break;
                case R.id.activity_manage_student_removeStudent: startActivity(new Intent(ManageStudentActivity.this, RemoveStudentActivity.class));
                    break;
                case R.id.activity_manage_student_editStudent: startActivity(new Intent(ManageStudentActivity.this, EditStudent.class));
                    break;
            }
        }
    };

}
