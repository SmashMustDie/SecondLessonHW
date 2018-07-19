package com.services;

import com.dao.ItemDao;
import com.models.Item;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemDao itemDao;

    public List<Item> getAllItems() {
        return itemDao.getAllItems();
    }

    public List<Item> getItemsByUser(User user) {
        return itemDao.getItemsByUser(user);
    }
}
