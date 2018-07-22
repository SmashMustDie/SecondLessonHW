package org.models;

import java.util.List;

public class VaultOrg {

    private int id;
    private String location;
    private List<ItemOrg> content;

    public VaultOrg(int id, String location, List<ItemOrg> content) {
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

    public List<ItemOrg> getContent() {
        return content;
    }

    public void setContent(List<ItemOrg> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "VaultOrg{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", content=" + content +
                '}';
    }
}
