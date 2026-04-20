package com.praktikum7db.praktikum7db.controller;

import com.praktikum7db.praktikum7db.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    // Constructor Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Tambahkan di dalam class UserController

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }
}