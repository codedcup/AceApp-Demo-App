package com.codedcup.aceapp.activities.common;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.codedcup.aceapp.R;

public class DownloadActivity extends BaseAuthenticationActivity{
    CardView card ;
    TextView file1;
    Button btn1, btn2;

    @Override
    protected void OnAppCreate(Bundle savedState) {
        setContentView(R.layout.activity_download);


    }
}
