package com.example.back.v1.domain.service;


import com.example.back.v1.domain.mapper.UserMapper;
import com.example.back.v1.domain.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String tenantId) {
        return userMapper.getUser(tenantId);
    }

    public User createUser(User user){
        return userMapper.createUser(user);
    }

    public User updateUser(User user){
        return userMapper.updateUser(user);
    }

    public User deleteUser(String tenantId) {
        return userMapper.deleteUser(tenantId);
    }

}
