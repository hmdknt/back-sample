package com.example.back.v1.domain.service;

import com.example.back.v1.domain.model.User;

public interface UserService {
    User getUser(String tenantId);
}
