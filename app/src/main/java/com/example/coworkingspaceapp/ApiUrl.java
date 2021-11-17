package com.example.coworkingspaceapp;

public class ApiUrl {
   static String mainUrl = "http://localhost:1337/";
   static String registerUrl = "auth/local/register";

    public static String getMainUrl() {
        return mainUrl;
    }

    public static String getRegisterUrl() {
        return registerUrl;
    }

    public static String getLoginUrl() {
        return loginUrl;
    }

    static String loginUrl = mainUrl + "auth/local";
}
