package com.example.coworkingspaceapp.services;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.coworkingspaceapp.ApiUrl;
import com.example.coworkingspaceapp.models.User;
import com.google.gson.Gson;

public class CoworkingSpaceService {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void find() {
        Gson gson = new Gson();
        new Thread(() -> {
            try {
                Request.getRequest(ApiUrl.getCoworkingSpaceUrl());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void findOne(String id) {
        Gson gson = new Gson();
        new Thread(() -> {
            try {
                Request.getRequest(ApiUrl.getCoworkingSpaceUrl()+ id );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }

}
