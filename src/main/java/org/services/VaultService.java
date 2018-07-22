package org.services;

import org.dao.VaultDaoOrg;
import org.models.ItemOrg;
import org.models.VaultOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaultService {

    @Autowired
    private VaultDaoOrg vaultDaoOrgOrg;

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
