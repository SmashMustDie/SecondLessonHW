package com.dao;

import com.models.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("userDao2")
public class UserDaoImplSecond implements UserDao{

    private List<User> userList = Arrays.asList(
            new User("Nameless The One",1500),
            new User("Choosen The One",21));

    public List<User> getUserList() {
        return userList;
    }
}
