package com.example.back.v1.domain.service;


import com.example.back.v1.domain.mapper.UserMapper;
import com.example.back.v1.domain.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Slf4j
@Service
@Transactional
public class UserServiceImpl {

    @Autowired
    UserMapper userMapper;

    public User getUser(String tenantId) {
        return userMapper.getUser(tenantId);
    }

    public void createUser(User user){
        userMapper.createUser(user);
    }

    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    public void deleteUser(String tenantId) {
        userMapper.deleteUser(tenantId);
    }

}
