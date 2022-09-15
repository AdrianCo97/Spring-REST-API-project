package com.example.Spring.REST.API.projekt.user.controller;
import com.example.Spring.REST.API.projekt.user.model.UserModel;
import com.example.Spring.REST.API.projekt.user.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping("/")
    public UserModel createUser(@Valid @RequestBody UserModel userModel) {
        userRepository.save(userModel);
        return userModel;
    }

    @GetMapping("/allUsers")
    public List<UserModel> getUsers(){
        List<UserModel> allUsers = (List)userRepository.findAll();
        return allUsers;
    }


    @GetMapping("/user/{id}")
    public ResponseEntity<UserModel> findUser(@PathVariable Long id){
        Optional<UserModel> foundUser = Optional.ofNullable(userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException()));



        return new ResponseEntity(foundUser, HttpStatus.OK);
    }

}
