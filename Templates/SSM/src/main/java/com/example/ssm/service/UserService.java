package com.example.ssm.service;

import com.example.ssm.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author abc12345131
 * @create 2023/5/20-3:05
 */

public interface UserService {

    List<User> getAllUser();

    PageInfo<User> getUserByPage(Integer pageNumber);

    void updateUser(User user);
}
