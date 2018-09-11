package com.szxs.service;

import com.szxs.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> queryUser();

    /**
     * 增加
     * @param user
     * @return
     */
    int addUser(User user);
}
