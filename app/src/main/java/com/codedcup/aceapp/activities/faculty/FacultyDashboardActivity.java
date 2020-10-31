package com.codedcup.aceapp.activities.faculty;

import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.codedcup.aceapp.R;
import com.codedcup.aceapp.activities.common.AcademicInfoActivity;
import com.codedcup.aceapp.activities.common.BaseAuthenticationActivity;
import com.codedcup.aceapp.activities.common.UploadActivity;

public class FacultyDashboardActivity extends BaseAuthenticationActivity {
    CardView notice;
    CardView notes;
    CardView syllabus;
    CardView paper;
    CardView sessional;
    CardView timeTable;
    CardView assignment;
    CardView practicals;

    @Override
    protected void OnAppCreate(Bundle savedState) {
        setContentView(R.layout.activity_faculty_dashboard);
        notice = findViewById(R.id.activity_faculty_dashboard_notice);
        notes = findViewById(R.id.activity_faculty_dashboard_notes);
        assignment = findViewById(R.id.activity_faculty_dashboard_assignment);
        practicals = findViewById(R.id.activity_faculty_dashboard_practicals);
        paper = findViewById(R.id.activity_faculty_dashboard_paper);
        syllabus = findViewById(R.id.activity_faculty_dashboard_syllabus);
        sessional = findViewById(R.id.activity_faculty_dashboard_sessional);
        timeTable = findViewById(R.id.activity_faculty_dashboard_timetable);

        notice.setOnClickListener(listener);
        notes.setOnClickListener(listener);
        syllabus.setOnClickListener(listener);
        assignment.setOnClickListener(listener);
        practicals.setOnClickListener(listener);
        paper.setOnClickListener(listener);
        sessional.setOnClickListener(listener);
        timeTable.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(FacultyDashboardActivity.this, AcademicInfoActivity.class));
        }
    };
}

