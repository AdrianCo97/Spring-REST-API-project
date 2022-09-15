package com.example.Spring.REST.API.projekt.user.controller;

import com.example.Spring.REST.API.projekt.user.model.UserModel;
import com.example.Spring.REST.API.projekt.user.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping("/")
    public UserModel createUser(@Valid @RequestBody UserModel userModel){
        userRepository.save(userModel);
        return userModel;
    }

    @GetMapping("/allUsers")
    public List<UserModel> getUsers(){
        return (List)userRepository.findAll();
    }
}
