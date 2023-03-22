package com.imooc.demo.controller;

import com.imooc.demo.dto.UserDto;
import com.imooc.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        UserDto userDto1 = new UserDto();
        userDto1.setLoginName("mjw");
        userDto1.setPassword("123");
        UserDto userDto = userService.doLogin(userDto1);
        System.out.println(123);
        return "Greetings from Spring Boot!";

    }
    @RequestMapping("/hello")
    public String hello() {
        System.out.println(123);
        return "Greetings from Spring Boot!";
    }
}