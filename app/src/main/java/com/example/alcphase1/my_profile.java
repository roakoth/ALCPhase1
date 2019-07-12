package com.example.alcphase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class my_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
