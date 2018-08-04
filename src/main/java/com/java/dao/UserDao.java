package com.java.dao;

import com.java.entity.User;

import java.util.List;


public interface UserDao {

    public User queryUserById(String id);

    public List<User> queryAll();
}
