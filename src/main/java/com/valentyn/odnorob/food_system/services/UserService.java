package com.valentyn.odnorob.food_system.services;

import com.valentyn.odnorob.food_system.DTO.UserDTO;
import com.valentyn.odnorob.food_system.entity.UserEntity;
import com.valentyn.odnorob.food_system.mapper.UserMapper;
import com.valentyn.odnorob.food_system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public UserMapper userMapper;

    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    public UserEntity createUser(@Valid @RequestBody UserDTO userDTO){
        return userMapper.mapToUserEntity(userDTO);
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }


}
