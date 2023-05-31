package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abc12345131
 * @createdAt 2023/5/19-17:33
 */

@RestController
@RequestMapping(value="/user")
public class UserController {

    @GetMapping(value="/name")
    public String getUserName(){

        return "ABC";
    }

}
