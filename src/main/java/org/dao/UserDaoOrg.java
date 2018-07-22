package org.dao;

import org.models.UserOrg;

import java.util.List;

public interface UserDaoOrg {

    public List<UserOrg> getUserOrgList();

    public UserOrg getUserById(int id);
}
