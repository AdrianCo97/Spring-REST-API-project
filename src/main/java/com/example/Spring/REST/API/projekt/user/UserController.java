package com.example.Spring.REST.API.projekt.user;

import org.springframework.web.bind.annotation.RestController;

@RestController("/api/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    
}
