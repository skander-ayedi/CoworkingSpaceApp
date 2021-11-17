package com.example.coworkingspaceapp.services;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.coworkingspaceapp.ApiUrl;
import com.example.coworkingspaceapp.contract.Authentificable;
import com.example.coworkingspaceapp.models.User;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

public class UserService implements Authentificable {



    @RequiresApi(api = Build.VERSION_CODES.O)
    public User login(User user) {
        HttpClient httpClient = null;

        try {

            HttpPost request = new HttpPost("http://yoururl");
            StringEntity params =new StringEntity(User.toJsonString(user));
            request.addHeader("content-type", "application/x-www-form-urlencoded");
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);



            //handle response here...

        }catch (Exception ex) {

            //handle exception here

        } finally {
            //Deprecated
            //httpClient.getConnectionManager().shutdown();
        }
        return user;
    }


    public void logout() {

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static User register(User user) {

        HttpClient httpClient = null;

        try {

            HttpPost request = new HttpPost(ApiUrl.getLoginUrl());
            StringEntity params =new StringEntity(User.toJsonString(user));
            request.addHeader("content-type", "application/x-www-form-urlencoded");
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);
            System.out.println(response);



            //handle response here...

        }catch (Exception ex) {

            //handle exception here

        } finally {
            //Deprecated
            //httpClient.getConnectionManager().shutdown();
        }
        return user;    }
}
