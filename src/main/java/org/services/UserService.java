package org.services;

import org.dao.UserDaoOrg;
import org.models.UserOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDaoOrg userDaoOrgOrg;

    public List<UserOrg> getUserList() {
        return userDaoOrgOrg.getUserOrgList();
    }

    public UserOrg getUserById(int id) {
        return userDaoOrgOrg.getUserById(id);
    }
}
