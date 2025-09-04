package com.demo.user.service;

import com.demo.user.model.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface UserService {
    UserEntity createUser(UserEntity user);
    UserEntity getUserById(UUID id);
    Page<UserEntity> getUsers(Pageable pageable);
}
