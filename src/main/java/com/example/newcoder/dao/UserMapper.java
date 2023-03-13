package com.example.newcoder.dao;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/13 20:41
 *
 * */

import com.example.newcoder.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper
{

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
