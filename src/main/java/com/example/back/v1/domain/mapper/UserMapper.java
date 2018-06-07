package com.example.back.v1.domain.mapper;

import com.example.back.v1.domain.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper {
    User getUser(String tenantId);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(String tenantId);
}
