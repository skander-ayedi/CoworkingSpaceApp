package com.example.coworkingspaceapp.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class CoworkingSpaceClass {
    private long id;
    private String name;
    private String address;
    private Object video;
    private long chairNumber;
    private long tableNumber;
    private long rating;
    private long phone;
    private String description;
    private OffsetDateTime publishedAt;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("address")
    public String getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(String value) { this.address = value; }

    @JsonProperty("video")
    public Object getVideo() { return video; }
    @JsonProperty("video")
    public void setVideo(Object value) { this.video = value; }

    @JsonProperty("chair_number")
    public long getChairNumber() { return chairNumber; }
    @JsonProperty("chair_number")
    public void setChairNumber(long value) { this.chairNumber = value; }

    @JsonProperty("table_number")
    public long getTableNumber() { return tableNumber; }
    @JsonProperty("table_number")
    public void setTableNumber(long value) { this.tableNumber = value; }

    @JsonProperty("rating")
    public long getRating() { return rating; }
    @JsonProperty("rating")
    public void setRating(long value) { this.rating = value; }

    @JsonProperty("phone")
    public long getPhone() { return phone; }
    @JsonProperty("phone")
    public void setPhone(long value) { this.phone = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

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
}
