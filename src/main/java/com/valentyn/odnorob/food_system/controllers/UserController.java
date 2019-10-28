package com.valentyn.odnorob.food_system.controllers;

import com.valentyn.odnorob.food_system.DTO.UserDTO;
import com.valentyn.odnorob.food_system.entity.UserEntity;
import com.valentyn.odnorob.food_system.exception.UserNotFoundException;
import com.valentyn.odnorob.food_system.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/users")
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public UserEntity getUserById(@PathVariable(value = "id") Long userId){
        return userService.findById(userId)
                .orElseThrow(UserNotFoundException::new);
    }

    @PostMapping("/createUser")
    public UserEntity createUser(UserDTO userDTO){
        return userService.createUser(userDTO);
    }
}
