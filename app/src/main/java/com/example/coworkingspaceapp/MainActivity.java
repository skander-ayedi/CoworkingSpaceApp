package com.example.coworkingspaceapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;

import com.example.coworkingspaceapp.models.CoworkingSpace;
import com.example.coworkingspaceapp.models.User;
import com.example.coworkingspaceapp.services.CoworkingSpaceService;
import com.example.coworkingspaceapp.services.UserService;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);
        super.onCreate(savedInstanceState);
        User user1 = new User((long) 0, "userz@gmail.com", "userz@gmail.com", "password$12A");

        try {
            UserService.login(user1);
            CoworkingSpaceService.find();
        } catch (Exception e) {
            e.printStackTrace();
        }
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();

    }
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent4 = new Intent(this, MainActivity4.class);
        startActivity(intent4);
    }

    public void launchSecondActivity5(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent5 = new Intent(this, MainActivity5.class);
        startActivity(intent5);
    }

        }
