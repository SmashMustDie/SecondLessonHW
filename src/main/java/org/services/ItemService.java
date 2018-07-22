package org.services;

import org.dao.ItemDaoOrg;
import org.models.ItemOrg;
import org.models.UserOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemDaoOrg itemDaoOrg;

    public List<ItemOrg> getAllItems() {
        return itemDaoOrg.getAllItems();
    }

    public List<ItemOrg> getItemsByUser(UserOrg userOrg) {
        return itemDaoOrg.getItemsByUser(userOrg);
    }
}
