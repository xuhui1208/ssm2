package com.java.dao;

import com.java.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    public User queryAll(@Param("id")String id);
}
