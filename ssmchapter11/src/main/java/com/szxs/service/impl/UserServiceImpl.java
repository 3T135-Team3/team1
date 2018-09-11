package com.szxs.service.impl;

import com.szxs.dao.UserMapper;
import com.szxs.entity.User;
import com.szxs.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> queryUser() {
        return userMapper.queryUsers();
    }

    public int addUser(User user) {
        userMapper.addUser(new User("小1"));

        if(true){
            //throw new ArithmeticException("扔出的异常");
        }

        return userMapper.addUser(new User("小2"));
    }
}
