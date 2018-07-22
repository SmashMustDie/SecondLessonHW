package org.models;

public class ItemOrg {

    private int id;
    private String itemName;
    private UserOrg holder;

    public ItemOrg(int id, String itemName, UserOrg holder) {
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

    public UserOrg getHolder() {
        return holder;
    }

    public void setHolder(UserOrg holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "ItemOrg{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", holder=" + holder +
                '}';
    }
}
