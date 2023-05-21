package com.example.ssm.controller;

import com.example.ssm.pojo.User;
import com.example.ssm.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author abc12345131
 * @create 2023/5/19-17:33
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public String getAllUser(Model model) {
        List<User> list = userService.getAllUser();
        model.addAttribute("list", list);
        return "user_list";
    }

    @RequestMapping(value="/user/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") Integer id, @ModelAttribute("user") User user) {
        user.setId(id);
        userService.updateUser(user);
        return "redirect:/user";
    }

    @RequestMapping(value="/user/page/{pageNumber}", method = RequestMethod.GET)
    public String getUserByPage(@PathVariable("pageNumber") Integer pageNumber, Model model1) {
        PageInfo<User> page = userService.getUserByPage(pageNumber);
        model1.addAttribute("page", page);
        return "user_by_page";
    }
}
