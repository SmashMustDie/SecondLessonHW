package org.dao;

import org.models.ItemOrg;
import org.models.UserOrg;

import java.util.List;

public interface ItemDaoOrg {

    public List<ItemOrg> getAllItems();

    public List<ItemOrg> getItemsByUser(UserOrg userOrg);
}
