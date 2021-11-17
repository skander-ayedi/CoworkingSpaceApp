package com.example.coworkingspaceapp.services;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.coworkingspaceapp.ApiUrl;
import com.google.gson.Gson;

public class FeedbackService {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void find() {
        Gson gson = new Gson();
        new Thread(() -> {
            try {
                Request.getRequest(ApiUrl.getFeedbackUrl());
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
                Request.getRequest(ApiUrl.getFeedbackUrl()+ id );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }
}
