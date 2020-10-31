package com.codedcup.aceapp.activities.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.codedcup.aceapp.R;

public class AdminDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);
        CardView studentCard = findViewById(R.id.activity_admin_dashboard_manageStudent);
        CardView facultyCard = findViewById(R.id.activity_admin_dashboard_manageFaculty);

        studentCard.setOnClickListener(listener);
        facultyCard.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id){
                case R.id.activity_admin_dashboard_manageStudent: startActivity(new Intent(AdminDashboardActivity.this, ManageStudentActivity.class));
                    break;
                case R.id.activity_admin_dashboard_manageFaculty: startActivity(new Intent(AdminDashboardActivity.this, ManageFacultyActivity.class));
                    break;
            }
        }
    };
}
