package com.example.back.v1.domain.mapper;

import com.example.back.v1.domain.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper {
    User getUser(String tenantId);
    User createUser(User user);
    User updateUser(User user);
    User deleteUser(String tenantId);
}
