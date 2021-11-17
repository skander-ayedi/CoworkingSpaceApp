package com.example.coworkingspaceapp.services;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.coworkingspaceapp.ApiUrl;
import com.example.coworkingspaceapp.contract.Authentificable;
import com.example.coworkingspaceapp.models.User;
import com.google.gson.Gson;

public class UserService implements Authentificable {


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void login(User user) {
        Gson gson = new Gson();
        new Thread(() -> {
            try {
                Request.makeRequest(ApiUrl.getLoginUrl(), gson.toJson(user));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }


    public void logout() {

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void register(User user) throws Exception {
        Gson gson = new Gson();
        new Thread(() -> {
            try {
                Request.makeRequest(ApiUrl.getRegisterUrl(), gson.toJson(user));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}