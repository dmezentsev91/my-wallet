package com.demo.user.controller;

import com.demo.user.model.UserEntity;
import com.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable UUID id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public Page<UserEntity> getUsers(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "10") int size) {
        return userService.getUsers(PageRequest.of(page, size));
    }
}
