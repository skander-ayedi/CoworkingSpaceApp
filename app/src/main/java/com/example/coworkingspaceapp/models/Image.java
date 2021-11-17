package com.example.coworkingspaceapp.models;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.time.OffsetDateTime;

public class Image {
    private long id;
    private String url;
    private CoworkingSpace coworkingSpace;
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
    public CoworkingSpace getCoworkingSpace() { return coworkingSpace; }
    @JsonProperty("coworking_space")
    public void setCoworkingSpace(CoworkingSpace value) { this.coworkingSpace = value; }

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
    public static Image[] ImagefromJson(String json) throws IOException {
        return Converter.getObjectReader().readValue(json);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String toJsonString(Image[] obj) throws JsonProcessingException {
        return Converter.getObjectWriter().writeValueAsString(obj);
    }

}


