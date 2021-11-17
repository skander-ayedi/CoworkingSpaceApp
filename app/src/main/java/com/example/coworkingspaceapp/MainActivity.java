package com.example.coworkingspaceapp;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.coworkingspaceapp.models.User;
import com.example.coworkingspaceapp.services.UserService;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        User user1 = new User(null, "user@gmail.com", "user@gmail.com", "password$12A");

        UserService.register(user1);
        setContentView(R.layout.activity_main);
    }
}