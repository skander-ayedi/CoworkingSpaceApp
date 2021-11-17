package com.example.coworkingspaceapp.services;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.coworkingspaceapp.ApiUrl;
import com.example.coworkingspaceapp.models.User;
import com.google.gson.Gson;

public class ProductService {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void find(User user) {
        Gson gson = new Gson();
        new Thread(() -> {
            try {
                Request.makeRequest(ApiUrl.getLoginUrl(), gson.toJson(user));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }

}
