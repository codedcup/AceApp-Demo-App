package com.codedcup.aceapp.activities.common;

import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;
import com.codedcup.aceapp.R;
import com.codedcup.aceapp.activities.student.StudentSignupActivity;

public class UserTypeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_user_type);

        CardView studentCard = findViewById(R.id.activity_user_type_student);
        CardView parentCard = findViewById(R.id.activity_user_type_parent);

        studentCard.setOnClickListener(listener);
        parentCard.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id){
                case R.id.activity_user_type_student: startActivity(new Intent(UserTypeActivity.this, StudentSignupActivity.class));
                    break;
                case R.id.activity_user_type_parent: startActivity(new Intent(UserTypeActivity.this, StudentSignupActivity.class));
                    break;
            }
        }
    };
}