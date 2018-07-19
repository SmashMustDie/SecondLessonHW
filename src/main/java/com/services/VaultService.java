package com.services;

import com.dao.VaultDao;
import com.models.Item;
import com.models.Vault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaultService {

    @Autowired
    private VaultDao vaultDao;

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
