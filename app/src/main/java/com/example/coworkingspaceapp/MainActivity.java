package com.example.coworkingspaceapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;

import com.example.coworkingspaceapp.adapters.CoworkingSpaceListAdapter;
import com.example.coworkingspaceapp.models.CoworkingSpace;
import com.example.coworkingspaceapp.models.User;
import com.example.coworkingspaceapp.services.CoworkingSpaceService;

import java.util.LinkedList;
import java.util.concurrent.FutureTask;

import static com.example.coworkingspaceapp.services.CoworkingSpaceService.coworkingSpaces;



public class MainActivity extends AppCompatActivity implements OnImageClickListener{
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    static final LinkedList<String> mWordList = new LinkedList<>();
    static RecyclerView mRecyclerView;
    static CoworkingSpaceListAdapter mAdapter;
    static final LinkedList<CoworkingSpace> mCoworkingSpaceList = new LinkedList<CoworkingSpace>();
    FutureTask<LinkedList<CoworkingSpace>> futureTask1 ;
    Intent intent3;




    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState)  {



        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);


            downloadImageAsync();




            super.onCreate(savedInstanceState);
        User user1 = new User((long) 0, "userz@gmail.com", "userz@gmail.com", "password$12A");




            setContentView(R.layout.activity_main);

            for (CoworkingSpace coworkingSpace: coworkingSpaces
                 ) {
                mCoworkingSpaceList.addLast(coworkingSpace);



            }


            // Get a handle to the RecyclerView.
            mRecyclerView = findViewById(R.id.recyclerview);
// Create an adapter and supply the data to be displayed.
            System.out.println("pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp");

            System.out.println(mCoworkingSpaceList.size());
            System.out.println("pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp");
            mAdapter = new CoworkingSpaceListAdapter(this, mCoworkingSpaceList );
// Connect the adapter with the RecyclerView.

            mRecyclerView.setAdapter(mAdapter);
// Give the RecyclerView a default layout manager.
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));



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

    public void launchSecondActivity3(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent3 = new Intent(this, MainActivity3.class);
        intent3.putExtra("coworking_space_position",0);



        startActivity(intent3);

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void downloadImageAsync() {
        try {
            CoworkingSpaceService.find();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Now we can execute the long-running task at any time.
        new CoworkingSpaceService().execute();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println(coworkingSpaces[0].getName());
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");


    }


    @Override
    public int onImageClick(int imageData) {
        System.out.println("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        intent3.putExtra("coworking_space_position",imageData);
        return  imageData;
    }
}

