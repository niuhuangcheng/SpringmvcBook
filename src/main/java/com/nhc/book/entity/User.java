package com.nhc.book.entity;

import lombok.Data;

/**
 * Author: bluesky
 * Email: wangwujuan@finupgroup.com
 * Date:2018-12-04
 * Desc:
 */
@Data
public class User {
    private int id;
    private String username;// 用户名
    private String password;// 密码
    private String repassword;// 确认密码
    private String gender;// 性别
    private String email;// 邮箱
    private String telephone;// 电话号码
    private String introduce;// 个人简介
    private String activeCode; // 邮箱激活码
    private int state; // 激活状态 0：未激活 1激活
    private String role; // 角色，默认是普通用户
    private String registerTime;// 注册时间
    private String code;// 输入的中文验证码
        }
