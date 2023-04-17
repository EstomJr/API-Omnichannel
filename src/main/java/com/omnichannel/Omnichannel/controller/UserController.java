package com.omnichannel.Omnichannel.controller;

import com.example.omnichannel.dto.LoginRequest;
import com.example.omnichannel.entity.User;
import com.example.omnichannel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public User login(@RequestBody LoginRequest loginRequest) {
        // implementation omitted for brevity
    }

    // other endpoints for user management
}

