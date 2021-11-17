package com.example.coworkingspaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent4 = getIntent();
    }
    public void launchSecondActivity1(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}