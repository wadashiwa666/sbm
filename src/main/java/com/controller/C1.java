package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class C1 {
    @Autowired
    private UserService userService;

    @RequestMapping("/aaa")
    public String aaa() {
        return "aaa";
    }

    @RequestMapping("/bbb")
    public String bbb() {
        List<User> users = userService.selectAllUser();
        System.out.println("asdsadsa");
        return users.toString();
    }
}
