package com.dao;

import com.models.Item;
import com.models.Vault;

import java.util.List;

public interface VaultDao {

    public Vault getVault();
    public List<Item> getItemsFromVault();
    public String getLocation();
}
