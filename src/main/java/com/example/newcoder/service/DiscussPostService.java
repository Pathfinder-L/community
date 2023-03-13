package com.example.newcoder.service;

import com.example.newcoder.dao.DiscussPostMapper;
import com.example.newcoder.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/13 20:49
 *
 * */
@Service
public class DiscussPostService
{

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit)
    {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    public int findDiscussPostRows(int userId)
    {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}