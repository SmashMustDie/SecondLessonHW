package org.dao;

import org.models.UserOrg;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("userDaoOrg")
public class UserDaoOrgImpl implements UserDaoOrg {

    private List<UserOrg> userOrgList = Arrays.asList(
            new UserOrg(1, "Doctor Who", 1500, "Admin"),
            new UserOrg(2, "Dalek",21, "SuperUser"));

    public List<UserOrg> getUserOrgList() {
        return userOrgList;
    }

    public UserOrg getUserById(int id) {
        if (id == 1) {
            return getUserOrgList().get(0);
        } else {
            return getUserOrgList().get(1);
        }
    }
}
