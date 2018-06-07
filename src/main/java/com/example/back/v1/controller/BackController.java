package com.example.back.v1.controller;

import com.example.back.v1.domain.model.User;
import com.example.back.v1.domain.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Date;


@RestController
public class BackController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping (value = "user", method = RequestMethod.GET)
    public User getUser(String tenantId){
        User user = userServiceImpl.getUser(tenantId);
        return user;
    }

    @RequestMapping(value = "user", method = RequestMethod.POST)
    public void createUser(@RequestBody User user){
        userServiceImpl.createUser(user);
    }

    @RequestMapping(value = "user", method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user){
        userServiceImpl.updateUser(user);
    }

    @RequestMapping(value = "user", method = RequestMethod.DELETE)
    public void deleteUser(String tenantId){
        userServiceImpl.deleteUser(tenantId);
    }



}
