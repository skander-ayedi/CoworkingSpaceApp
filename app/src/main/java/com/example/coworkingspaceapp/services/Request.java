package com.example.coworkingspaceapp.services;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.Map;

public class Request {

    public static void makeRequest(String path, String params) throws Exception
    {
        System.out.println(params);
        //instantiates httpclient to make request
        DefaultHttpClient httpclient = new DefaultHttpClient();

        //url with the post data
        HttpPost httpost = new HttpPost(path);

        //convert parameters into JSON object

        //passes the results to a string builder/entity
        StringEntity se = new StringEntity(params);

        //sets the post request as the resulting string
        httpost.setEntity(se);
        //sets a request header so the page receving the request
        //will know what to do with it
        httpost.setHeader("Accept", "application/json");
        httpost.setHeader("Content-type", "application/json");

        //Handles what is returned from the page
        ResponseHandler responseHandler = new BasicResponseHandler();
        System.out.println("*****************************************************************");

        HttpResponse response = httpclient.execute(httpost);
        String responseString = new BasicResponseHandler().handleResponse(response);

        System.out.println("*****************************************************************yes");
        System.out.print(responseString);


        System.out.println(response);

    }

    public static void getRequest(String path) throws Exception
    {
        //instantiates httpclient to make request
        DefaultHttpClient httpclient = new DefaultHttpClient();

        //url with the post data
        HttpGet httpget = new HttpGet(path);

        //convert parameters into JSON object

        //passes the results to a string builder/entity

        //sets the post request as the resulting string
        //sets a request header so the page receving the request
        //will know what to do with it
        httpget.setHeader("Accept", "application/json");
        httpget.setHeader("Content-type", "application/json");

        //Handles what is returned from the page
        ResponseHandler responseHandler = new BasicResponseHandler();
        System.out.println("*****************************************************************");

        HttpResponse response = httpclient.execute(httpget);
        String responseString = new BasicResponseHandler().handleResponse(response);

        System.out.println("*****************************************************************yes");
        System.out.print(responseString);


        System.out.println(response);

    }





}
