package com.nhc.book.dao;


import com.nhc.book.entity.User;

import java.sql.SQLException;


public interface UserMapper {
    public int insertUser(User user) throws SQLException;

    public int updateStateByActiveCode(String activeCode)throws SQLException;

    public User queryUserByUserNameAndPassword(User user)throws SQLException;

    public int updateUserInfo(User user)throws SQLException;
}
