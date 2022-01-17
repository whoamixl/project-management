package com.example.projectmanagement.controller;

import com.example.projectmanagement.Utils.ResponseUtils;
import com.example.projectmanagement.entity.User;
import com.example.projectmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import java.security.SecureRandom;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/insert")
    public String insertUser(User user, Httprequse requestHandlerServlet){
        requestHandlerServlet.gets
        System.out.println(user);

        int i = userService.insertUser(user);
        String success = ResponseUtils.success(i);
        return success;
    }
}
