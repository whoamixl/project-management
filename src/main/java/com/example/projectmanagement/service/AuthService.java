package com.example.projectmanagement.service;

public interface AuthService {
    /**
     * 
     * @param account 账号
     * @param password 密码
     * @return java.lang.String
     * @author Yxiaolong
     * @creed: 用户登陆接口
     * @date 2022/1/17 11:17
     */
    String login(String account, String password);
}
