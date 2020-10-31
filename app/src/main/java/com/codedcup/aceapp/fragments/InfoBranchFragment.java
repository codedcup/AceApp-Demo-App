package com.codedcup.aceapp.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.codedcup.aceapp.R;

public class InfoBranchFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_info_branch, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CardView cseLayout = view.findViewById(R.id.fragment_info_branch_cse_layout);
        CardView meLayout = view.findViewById(R.id.fragment_info_branch_me_layout);
        CardView civilLayout = view.findViewById(R.id.fragment_info_branch_civil_layout);
        CardView eeLayout = view.findViewById(R.id.fragment_info_branch_ee_layout);

        cseLayout.setOnClickListener(listener);
        meLayout.setOnClickListener(listener);
        civilLayout.setOnClickListener(listener);
        eeLayout.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            SharedPreferences preferences = getActivity().getSharedPreferences("academicInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();

            switch (view.getId()){

                case R.id.fragment_info_branch_cse_layout: editor.putString("branch", "cse");
                    break;
                case R.id.fragment_info_branch_me_layout: editor.putString("branch", "me");
                    break;
                case R.id.fragment_info_branch_civil_layout: editor.putString("branch", "civil");
                    break;
                case R.id.fragment_info_branch_ee_layout: editor.putString("branch", "ee");
                    break;
            }
            editor.apply();

            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.activity_academic_info_container, new InfoYearFragment()).commit();
        }
    };
}
