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
//     User[] data = Converter.fromJsonString(jsonString);


import android.os.Build;

import androidx.annotation.RequiresApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.Map;

public class User {

    private Long id;
    private String username;
    private String email;
    private String password;
    private String identifier;

    public User(Long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.identifier = email;
    }



    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("username")
    public String getUsername() { return username; }
    @JsonProperty("username")
    public void setUsername(String value) { this.username = value; }

    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static User[] UserfromJson(String json) throws IOException {
        return Converter.getObjectReader().readValue(json);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String toJsonString(User obj) throws JsonProcessingException {
        return Converter.getObjectWriter().writeValueAsString(obj);
    }




}
