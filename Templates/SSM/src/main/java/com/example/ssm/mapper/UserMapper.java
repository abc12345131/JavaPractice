package com.example.ssm.mapper;

import com.example.ssm.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author abc12345131
 * @create 2023/5/20-21:16
 */

public interface UserMapper {

    List<User> getAllUser();

    void updateUser(User user);
}
