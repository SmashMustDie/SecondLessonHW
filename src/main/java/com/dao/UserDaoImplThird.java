package com.dao;

import com.models.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("userDao3")
public class UserDaoImplThird implements UserDao{

    private List<User> userList = Arrays.asList(
            new User("Human",10),
            new User("Human",50));

    public List<User> getUserList() {
        return userList;
    }
}
