package com.example.coworkingspaceapp.models;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.time.OffsetDateTime;

public class Feedback {
    private long id;
    private String review;
    private long rating;
    private CoworkingSpace coworkingSpace;
    private OffsetDateTime publishedAt;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("review")
    public String getReview() { return review; }
    @JsonProperty("review")
    public void setReview(String value) { this.review = value; }

    @JsonProperty("rating")
    public long getRating() { return rating; }
    @JsonProperty("rating")
    public void setRating(long value) { this.rating = value; }

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
    public static Feedback[] FeedbackfromJson(String json) throws IOException {
        return Converter.getObjectReader().readValue(json);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String toJsonString(Feedback[] obj) throws JsonProcessingException {
        return Converter.getObjectWriter().writeValueAsString(obj);
    }

}
