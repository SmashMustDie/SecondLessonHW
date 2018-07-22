package org.services;

import org.dao.ItemDaoOrg;
import org.dao.UserDaoOrg;
import org.dao.VaultDaoOrg;
import org.models.ItemOrg;
import org.models.UserOrg;
import org.models.VaultOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllServiceOrg {

    @Autowired
    private UserDaoOrg userDaoOrgOrg;

    @Autowired
    private VaultDaoOrg vaultDaoOrgOrg;

    @Autowired
    private ItemDaoOrg itemDaoOrg;

    public List<UserOrg> getUserList() {
        return userDaoOrgOrg.getUserOrgList();
    }

    public UserOrg getUserById(int id) {
        return userDaoOrgOrg.getUserById(id);
    }

    public List<ItemOrg> getAllItems() {
        return itemDaoOrg.getAllItems();
    }

    public List<ItemOrg> getItemsByUser(UserOrg userOrg) {
        return itemDaoOrg.getItemsByUser(userOrg);
    }

    public VaultOrg getVault() {
        return vaultDaoOrgOrg.getVaultOrg();
    }

    public List<ItemOrg> getItemsFromVault() {
        return vaultDaoOrgOrg.getItemsFromVault();
    }

    public String getLocation() {
        return vaultDaoOrgOrg.getLocation();
    }
}
