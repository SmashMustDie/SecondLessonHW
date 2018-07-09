package com.services;

import com.dao.UserDao;
import com.models.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceSecond {

    @Resource
    private UserDao userDao2;

    public List<User> getUserList() {
        return userDao2.getUserList();
    }
}
