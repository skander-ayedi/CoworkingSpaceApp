package com.example.coworkingspaceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.coworkingspaceapp.adapters.CoworkingSpaceListAdapter;
import com.example.coworkingspaceapp.adapters.ReviewListAdapter;
import com.example.coworkingspaceapp.models.CoworkingSpace;
import com.example.coworkingspaceapp.models.Feedback;

import java.util.ArrayList;

import static com.example.coworkingspaceapp.MainActivity.mCoworkingSpaceList;
import static com.example.coworkingspaceapp.services.CoworkingSpaceService.coworkingSpaces;

public class MainActivity3 extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    static RecyclerView mRecyclerView;
    static ReviewListAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        int position =  extras.getInt("coworking_space_position");

        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setContentView(R.layout.activity_main3);

        System.out.println("skanderskaskaskaksaksakskakska");

        System.out.println(position);
        System.out.println("skanderskaskaskaksaksakskakska");




        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
// Create an adapter and supply the data to be displayed.
        mAdapter = new ReviewListAdapter(this, mCoworkingSpaceList.get(position).getFeedbacks());
// Connect the adapter with the RecyclerView.

        mRecyclerView.setAdapter(mAdapter);
// Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


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