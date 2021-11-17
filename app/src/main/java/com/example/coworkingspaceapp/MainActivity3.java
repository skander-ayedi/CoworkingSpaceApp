package com.example.coworkingspaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void launchSecondActivity1(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void launchSecondActivity2(View view) {

        Log.d(LOG_TAG, "Button clicked!");
        Intent intent2 = new Intent(this, MainActivity2.class);
        startActivity(intent2);
    }

    public void launchSecondActivity5(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent5 = new Intent(this, MainActivity5.class);
        startActivity(intent5);
    }
}