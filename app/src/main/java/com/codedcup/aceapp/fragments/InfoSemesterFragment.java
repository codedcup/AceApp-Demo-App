package com.codedcup.aceapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.codedcup.aceapp.R;
import com.codedcup.aceapp.activities.common.UploadActivity;

public class InfoSemesterFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_info_semester, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CardView sem1Layout = view.findViewById(R.id.fragment_info_semester_sem1_layout);
        CardView sem2Layout = view.findViewById(R.id.fragment_info_semester_sem2_layout);

        sem1Layout.setOnClickListener(listener);
        sem2Layout.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getActivity(), UploadActivity.class));
            getActivity().finish();
        }
    };
}
