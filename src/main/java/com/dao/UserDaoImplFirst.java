package com.dao;

import com.models.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("userDao1")
public class UserDaoImplFirst implements UserDao{

    private List<User> userList = Arrays.asList(
            new User("name1",22),
            new User("name2",12));

    public List<User> getUserList() {
        return userList;
    }
}
