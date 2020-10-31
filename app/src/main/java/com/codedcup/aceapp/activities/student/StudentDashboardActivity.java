package com.codedcup.aceapp.activities.student;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.cardview.widget.CardView;

import com.codedcup.aceapp.R;
import com.codedcup.aceapp.activities.common.BaseAuthenticationActivity;
import com.codedcup.aceapp.activities.common.DownloadActivity;

public class StudentDashboardActivity extends BaseAuthenticationActivity {

    @Override
    protected void OnAppCreate(Bundle savedState) {
        setContentView(R.layout.activity_student_dashboard);

        CardView notesLayout = findViewById(R.id.activity_student_dashboard_notes_layout);
        CardView assignmentLayout = findViewById(R.id.activity_student_dashboard_assignment_layout);
        CardView noticeLayout = findViewById(R.id.activity_student_dashboard_notice_layout);
        CardView practicalLayout = findViewById(R.id.activity_student_dashboard_practical_layout);
        CardView timetableLayout = findViewById(R.id.activity_student_dashboard_timetable_layout);
        CardView sessionalLayout = findViewById(R.id.activity_student_dashboard_sessional_layout);
        CardView questionLayout = findViewById(R.id.activity_student_dashboard_question_layout);
        CardView syllabusLayout = findViewById(R.id.activity_student_dashboard_syllabus_layout);

        notesLayout.setOnClickListener(listener);
        assignmentLayout.setOnClickListener(listener);
        noticeLayout.setOnClickListener(listener);
        practicalLayout.setOnClickListener(listener);
        timetableLayout.setOnClickListener(listener);
        sessionalLayout.setOnClickListener(listener);
        questionLayout.setOnClickListener(listener);
        syllabusLayout.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(), DownloadActivity.class));
        }
    };
}