package org.dao;

import org.models.ItemOrg;
import org.models.UserOrg;
import org.models.VaultOrg;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("vaultDaoOrg")
public class VaultDaoOrgImpl implements VaultDaoOrg {

    private List<ItemOrg> itemOrgList = Arrays.asList(
            new ItemOrg(1, "Time", new UserOrg(1, "Doctor Who", 1500, "Admin")),
            new ItemOrg(2, "Space", new UserOrg(1, "Doctor Who", 1500, "Admin")),
            new ItemOrg(3, "Weapon", new UserOrg(2, "Dalek",21, "SuperUser")),
            new ItemOrg(4, "Strange Voice", new UserOrg(2, "Dalek",21, "SuperUser")));

    private VaultOrg vaultOrg = new VaultOrg(1, "Tardis", itemOrgList);

    public VaultOrg getVaultOrg() {
        return vaultOrg;
    }

    public List<ItemOrg> getItemsFromVault() {
        return vaultOrg.getContent();
    }

    public String getLocation() {
        return vaultOrg.getLocation();
    }
}

