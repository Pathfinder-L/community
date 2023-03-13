package com.example.newcoder;

import com.example.newcoder.dao.UserMapper;
import com.example.newcoder.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NewCoderApplicationTests
{


    @Autowired
    UserMapper userMapper;

    @Test
    void testUserMapper()
    {
        User user = userMapper.selectById(6);
        System.out.println(user);
    }

    @Test
    void contextLoads()
    {
    }

}
