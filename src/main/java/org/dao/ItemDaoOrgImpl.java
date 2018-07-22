package org.dao;

import org.models.ItemOrg;
import org.models.UserOrg;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository("itemDaoOrg")
public class ItemDaoOrgImpl implements ItemDaoOrg {

    private List<ItemOrg> itemOrgList = Arrays.asList(
            new ItemOrg(1, "Time", new UserOrg(1, "Doctor Who", 1500, "Admin")),
            new ItemOrg(2, "Space", new UserOrg(1, "Doctor Who", 1500, "Admin")),
            new ItemOrg(3, "Weapon", new UserOrg(2, "Dalek",21, "SuperUser")),
            new ItemOrg(4, "Strange Voice", new UserOrg(2, "Dalek",21, "SuperUser")));

    public List<ItemOrg> getAllItems() {
        return itemOrgList;
    }

    public List<ItemOrg> getItemsByUser(UserOrg userOrg) {
        List<ItemOrg> returnedList = new ArrayList<ItemOrg>();
        if (userOrg.getId() == 1) {
            returnedList.add(itemOrgList.get(0));
            returnedList.add(itemOrgList.get(1));
            return returnedList;
        }
        returnedList.add(itemOrgList.get(2));
        returnedList.add(itemOrgList.get(3));
        return returnedList;
    }
}
