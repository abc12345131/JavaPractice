package com.example.ssm.service.impl;

import com.example.ssm.mapper.UserMapper;
import com.example.ssm.pojo.User;
import com.example.ssm.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author abc12345131
 * @create 2023/5/20-3:07
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public PageInfo<User> getUserByPage(Integer pageNumber) {
        PageHelper.startPage(pageNumber, 10);
        List<User> list = userMapper.getAllUser();
        PageInfo<User> pageInfo = new PageInfo<>(list, 5);
        return pageInfo;
    }
}
