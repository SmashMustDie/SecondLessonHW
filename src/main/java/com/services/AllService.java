package com.services;

import com.dao.ItemDao;
import com.dao.UserDao;
import com.dao.VaultDao;
import com.models.Item;
import com.models.User;
import com.models.Vault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private VaultDao vaultDao;

    @Autowired
    private ItemDao itemDao;

    public List<User> getUserList() {
        return userDao.getUserList();
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public List<Item> getAllItems() {
        return itemDao.getAllItems();
    }

    public List<Item> getItemsByUser(User user) {
        return itemDao.getItemsByUser(user);
    }

    public Vault getVault() {
        return vaultDao.getVault();
    }

    public List<Item> getItemsFromVault() {
        return vaultDao.getItemsFromVault();
    }

    public String getLocation() {
        return vaultDao.getLocation();
    }
}
