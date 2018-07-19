package com.dao;

import com.models.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

    private List<User> userList = Arrays.asList(
            new User(1, "Nameless The One", 1500, "Admin"),
            new User(2, "Choosen The One",21, "SuperUser"));

    public List<User> getUserList() {
        return userList;
    }

    public User getUserById(int id) {
        if (id == 1) {
            return getUserList().get(0);
        } else {
            return getUserList().get(1);
        }
    }
}
