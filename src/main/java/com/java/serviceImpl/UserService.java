package com.java.serviceImpl;

import com.java.dao.UserDao;
import com.java.entity.User;
import com.java.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User queryOne(String id) {
        return userDao.queryAll(id);
    }
}
