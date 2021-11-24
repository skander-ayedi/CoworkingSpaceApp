package com.example.coworkingspaceapp;

public class ApiUrl {
   static String mainUrl = "http://192.168.43.253:8080/";
   static String registerUrl = mainUrl+"auth/local/register/";
    static String loginUrl = mainUrl + "auth/local/";
    static String coworkingSpaceUrl = mainUrl + "coworking-spaces/";
    static  String feedbackUrl = mainUrl + "feedbacks/";
    static  String imageUrl = mainUrl + "images/";

    public static String getFeedbackUrl() {
        return feedbackUrl;
    }

    public static String getImageUrl() {
        return imageUrl;
    }

    public static String getCoworkingSpaceUrl() {
        return coworkingSpaceUrl;
    }

    public static String getMainUrl() {
        return mainUrl;
    }

    public static String getRegisterUrl() {
        return registerUrl;
    }

    public static String getLoginUrl() {
        return loginUrl;
    }

}
