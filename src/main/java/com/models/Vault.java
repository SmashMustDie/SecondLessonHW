package com.models;

import java.util.List;

public class Vault {

    private int id;
    private String location;
    private List<Item> content;

    public Vault(int id, String location, List<Item> content) {
        this.id = id;
        this.location = location;
        this.content = content;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Item> getContent() {
        return content;
    }

    public void setContent(List<Item> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Vault{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", content=" + content +
                '}';
    }
}
