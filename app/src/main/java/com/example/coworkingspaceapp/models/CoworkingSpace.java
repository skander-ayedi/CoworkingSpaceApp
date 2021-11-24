package com.example.coworkingspaceapp.models;// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import io.quicktype.Converter;
//
// Then you can deserialize a JSON string with
//
//     CoworkingSpace[] data = Converter.fromJsonString(jsonString);


import android.os.Build;

import androidx.annotation.RequiresApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;


// CoworkingSpace.java



public class CoworkingSpace {
    private float id;
    private String name;
    private String address;
    private String video = null;
    private float chair_number;
    private float table_number;
    private float rating;
    private float phone;
    private String description;
    private String published_at;
    private String created_at;
    private String updated_at;
    ArrayList < Product > products = new ArrayList< Product >();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(ArrayList<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    ArrayList < Feedback > feedbacks = new ArrayList < Feedback > ();
    ArrayList < Image > images = new ArrayList < Image > ();


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getVideo() {
        return video;
    }

    public float getChair_number() {
        return chair_number;
    }

    public float getTable_number() {
        return table_number;
    }

    public float getRating() {
        return rating;
    }

    public float getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public String getPublished_at() {
        return published_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setChair_number(float chair_number) {
        this.chair_number = chair_number;
    }

    public void setTable_number(float table_number) {
        this.table_number = table_number;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setPhone(float phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }


}

// CoworkingSpaceClass.java

