package com.example.projectmanagement.service.impl;

import com.example.projectmanagement.entity.User;
import com.example.projectmanagement.mapper.UserMapper;
import com.example.projectmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：WHOAMI
 * @date ：Created in 2022/1/17 13:53
 * @description：
 * @modified By：
 * @version: $
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }
}
