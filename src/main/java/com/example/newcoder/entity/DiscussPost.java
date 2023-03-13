package com.example.newcoder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/13 20:39
 *
 * */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscussPost
{
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type; // 0:普通 1：置顶
    private int status; //  0：正常 1：精华  2：拉黑
    private Date createTime;
    private int commentCount;
    private double score;
}
