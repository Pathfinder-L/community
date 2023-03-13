package com.example.newcoder.service;

import com.example.newcoder.dao.UserMapper;
import com.example.newcoder.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/13 20:48
 *
 * */
@Service
public class UserService
{

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id)
    {
        return userMapper.selectById(id);
    }
}