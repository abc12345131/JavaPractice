package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abc12345131
 * @createdAt 6/5/2023-12:11 PM
 */
@RequiredArgsConstructor
@RestController
public class UserController {

    // autowired will have warning, so we use @RequiredArgsConstructor + final to deal with dependency injection
    // @Autowired
    private final UserMapper userMapper;

    @GetMapping("/user")
    public User getUserById(String id) {

        return userMapper.getUserById(id);
    }
}
