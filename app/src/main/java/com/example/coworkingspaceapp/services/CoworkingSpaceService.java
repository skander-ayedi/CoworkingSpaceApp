package com.example.coworkingspaceapp.services;

import android.os.AsyncTask;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.coworkingspaceapp.ApiUrl;
import com.example.coworkingspaceapp.models.CoworkingSpace;
import com.google.gson.Gson;

public class CoworkingSpaceService extends AsyncTask<Void, Integer, Void> {
   public static CoworkingSpace[] coworkingSpaces;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void find() {
        Gson gson = new Gson();
        new Thread(() -> {
            try {
                coworkingSpaces = gson.fromJson(Request.getRequest(ApiUrl.getCoworkingSpaceUrl()), CoworkingSpace[].class);

                System.out.println(coworkingSpaces);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();



    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void  findOne(int id) {
        Gson gson = new Gson();
        new Thread(() -> {
            try {

                CoworkingSpace[] coworkingSpaces = gson.fromJson(Request.getRequest(ApiUrl.getCoworkingSpaceUrl() ),  CoworkingSpace[].class);
                CoworkingSpace coworkingSpace = coworkingSpaces[0];
                System.out.println("*********************************************************************");

                System.out.println(coworkingSpace.getName());

                System.out.println("*********************************************************************");
                System.out.println(coworkingSpaces[0].getName());


            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();


    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected Void doInBackground(Void... strings) {
        find();
        return null;
    }
}
