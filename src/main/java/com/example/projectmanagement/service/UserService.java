package com.example.projectmanagement.service;

import com.example.projectmanagement.entity.User;

public interface UserService {
    
    /**
     * 
     * @param user  用户实体类
     * @return int
     * @author Yxiaolong
     * @creed:  添加用户
     * @date 2022/1/17 14:00
     */
    int insertUser(User user);
}
