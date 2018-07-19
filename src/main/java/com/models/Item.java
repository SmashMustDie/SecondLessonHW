package com.models;

public class Item {

    private int id;
    private String itemName;
    private User holder;

    public Item(int id, String itemName, User holder) {
        this.id = id;
        this.itemName = itemName;
        this.holder = holder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", holder=" + holder +
                '}';
    }
}
