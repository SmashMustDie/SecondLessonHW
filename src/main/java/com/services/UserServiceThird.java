package com.services;

import com.dao.UserDao;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceThird {

    @Autowired
    @Qualifier("userDao3")
    private UserDao userDao; // = new UserDao();

    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
