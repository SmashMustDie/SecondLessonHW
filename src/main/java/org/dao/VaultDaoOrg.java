package org.dao;

import org.models.ItemOrg;
import org.models.VaultOrg;

import java.util.List;

public interface VaultDaoOrg {

    public VaultOrg getVaultOrg();
    public List<ItemOrg> getItemsFromVault();
    public String getLocation();
}
