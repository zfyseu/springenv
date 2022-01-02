package com.ryan.env.controller;

import com.ryan.env.model.User;
import com.ryan.env.mapper.act.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserMapper userMapper;

    @ResponseBody()
    @RequestMapping("getUserById")
    public String getUserById(@RequestParam(value = "userId") Long userId) {
        User user = userMapper.getUserById(userId);
        if (user == null) {
            return "not found";
        } else {
            return user.getUsername() + " " + user.getAddress();
        }
    }

    @ResponseBody()
    @RequestMapping("insertUser")
    public String insertUser() {
        User user = new User();
        user.setUsername("zfy");
        user.setAddress("hk");
        userMapper.addUser(user);
        return "insert ok";
    }
}
