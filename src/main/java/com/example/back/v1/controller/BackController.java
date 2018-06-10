package com.example.back.v1.controller;

import com.example.back.v1.domain.model.User;
import com.example.back.v1.domain.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Date;


@RestController
@RequestMapping("user")
public class BackController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping
    public ResponseEntity getUser(@RequestParam String tenantId){
        return new ResponseEntity<>(userServiceImpl.getUser(tenantId),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody User user){
        return new ResponseEntity<>(userServiceImpl.createUser(user),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateUser(@RequestBody User user){
        return new ResponseEntity<>(userServiceImpl.updateUser(user),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteUser(@RequestParam String tenantId) {
        return new ResponseEntity<>(userServiceImpl.deleteUser(tenantId),HttpStatus.OK);
    }



}
