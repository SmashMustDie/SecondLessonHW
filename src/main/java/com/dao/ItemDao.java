package com.dao;

import com.models.Item;
import com.models.User;

import java.util.List;

public interface ItemDao {

    public List<Item> getAllItems();

    public List<Item> getItemsByUser(User user);
}
