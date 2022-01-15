package com.infractar.suboptimal.controllers;

import com.infractar.suboptimal.models.auth.User;
import com.infractar.suboptimal.services.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/auth/")
public class AuthController {
    private final UserServiceImpl userService;

    public AuthController(UserServiceImpl userService){
        this.userService = userService;
    }

    @PostMapping(path = "signup")
    public User Register(@RequestBody User user){
        return userService.saveUser(user);
    }
}
