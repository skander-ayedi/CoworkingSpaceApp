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


// CoworkingSpace.java



public class CoworkingSpace {
    private long id;
    private String url;
    private CoworkingSpaceClass coworkingSpace;
    private OffsetDateTime publishedAt;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("coworking_space")
    public CoworkingSpaceClass getCoworkingSpace() { return coworkingSpace; }
    @JsonProperty("coworking_space")
    public void setCoworkingSpace(CoworkingSpaceClass value) { this.coworkingSpace = value; }

    @JsonProperty("published_at")
    public OffsetDateTime getPublishedAt() { return publishedAt; }
    @JsonProperty("published_at")
    public void setPublishedAt(OffsetDateTime value) { this.publishedAt = value; }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() { return createdAt; }
    @JsonProperty("created_at")
    public void setCreatedAt(OffsetDateTime value) { this.createdAt = value; }

    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    @JsonProperty("updated_at")
    public void setUpdatedAt(OffsetDateTime value) { this.updatedAt = value; }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static CoworkingSpace[] CoworkingSpacefromJson(String json) throws IOException {
        return Converter.getObjectReader().readValue(json);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String toJsonString(CoworkingSpace[] obj) throws JsonProcessingException {
        return Converter.getObjectWriter().writeValueAsString(obj);
    }

}

// CoworkingSpaceClass.java

