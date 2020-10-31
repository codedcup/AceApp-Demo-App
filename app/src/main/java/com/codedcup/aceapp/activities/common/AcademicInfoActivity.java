package com.codedcup.aceapp.activities.common;

import android.os.Bundle;

import androidx.fragment.app.FragmentManager;

import com.codedcup.aceapp.R;
import com.codedcup.aceapp.fragments.InfoBranchFragment;

public class AcademicInfoActivity extends BaseAuthenticationActivity {
    @Override
    protected void OnAppCreate(Bundle savedState) {
        setContentView(R.layout.activity_academic_info);

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .replace(R.id.activity_academic_info_container, new InfoBranchFragment())
                .commit();
    }
}