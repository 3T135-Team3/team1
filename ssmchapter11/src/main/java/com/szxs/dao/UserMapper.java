package com.szxs.dao;

import com.szxs.entity.User;

import java.util.List;

public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryUsers();

    /**
     * 增加
     * @param user
     * @return
     */
    int addUser(User user);
}
