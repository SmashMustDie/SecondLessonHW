package com.dao;

import com.models.Item;
import com.models.User;
import com.models.Vault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("vaultDao")
public class VaultDaoImpl implements VaultDao{

    private List<Item> itemList = Arrays.asList(
            new Item(1, "Axe", new User(1, "Nameless The One", 1500, "Admin")),
            new Item(2, "Shield", new User(1, "Nameless The One", 1500, "Admin")),
            new Item(3, "Laptop", new User(2, "Choosen The One",21, "SuperUser")),
            new Item(4, "Nuke-Cola", new User(2, "Choosen The One",21, "SuperUser")));

    private Vault vault = new Vault(1, "NewerWhere", itemList);

    public Vault getVault() {
        return vault;
    }

    public List<Item> getItemsFromVault() {
        return vault.getContent();
    }

    public String getLocation() {
        return vault.getLocation();
    }
}

