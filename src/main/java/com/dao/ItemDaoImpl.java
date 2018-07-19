package com.dao;

import com.models.Item;
import com.models.User;
import com.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository("itemDao")
public class ItemDaoImpl implements ItemDao{

    private List<Item> itemList = Arrays.asList(
            new Item(1, "Axe", new User(1, "Nameless The One", 1500, "Admin")),
            new Item(2, "Shield", new User(1, "Nameless The One", 1500, "Admin")),
            new Item(3, "Laptop", new User(2, "Choosen The One",21, "SuperUser")),
            new Item(4, "Nuke-Cola", new User(2, "Choosen The One",21, "SuperUser")));

    public List<Item> getAllItems() {
        return itemList;
    }

    public List<Item> getItemsByUser(User user) {
        List<Item> returnedList = new ArrayList<Item>();
        if (user.getId() == 1) {
            returnedList.add(itemList.get(0));
            returnedList.add(itemList.get(1));
            return returnedList;
        }
        returnedList.add(itemList.get(2));
        returnedList.add(itemList.get(3));
        return returnedList;
    }
}
