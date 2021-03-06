package com.dao;

import com.models.User;

import java.util.List;

public interface UserDao {

    public List<User> getUserList();

    public User getUserById(int id);
}
