package com.codedcup.aceapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.codedcup.aceapp.R;

class InfoYearFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_info_year, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CardView firstLayout = view.findViewById(R.id.fragment_info_year_first_layout);
        CardView secondLayout = view.findViewById(R.id.fragment_info_year_second_layout);
        CardView thirdLayout = view.findViewById(R.id.fragment_info_year_third_layout);
        CardView fourthLayout = view.findViewById(R.id.fragment_info_year_fourth_layout);

        firstLayout.setOnClickListener(listener);
        secondLayout.setOnClickListener(listener);
        thirdLayout.setOnClickListener(listener);
        fourthLayout.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.activity_academic_info_container, new InfoSemesterFragment())
                    .commit();
        }
    };
}
