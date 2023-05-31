package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abc12345131
 * @createdAt 2023/5/30-21:02
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {

        return "Hello, world!";
    }
}
