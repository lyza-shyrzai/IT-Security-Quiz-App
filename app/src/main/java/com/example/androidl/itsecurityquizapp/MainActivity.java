package com.example.androidl.itsecurityquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This app is IT Security Quiz
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The number of correct answers
     */
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
