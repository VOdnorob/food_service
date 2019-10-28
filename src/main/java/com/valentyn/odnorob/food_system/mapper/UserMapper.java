package com.valentyn.odnorob.food_system.mapper;

import com.valentyn.odnorob.food_system.DTO.UserDTO;
import com.valentyn.odnorob.food_system.entity.UserEntity;
import com.valentyn.odnorob.food_system.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    @Autowired
    public UserService userService;

    @Autowired
    public DishMapper dishMapper;

    public UserEntity mapToUserEntity(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userDTO.getName());
        userEntity.setSurname(userDTO.getSurname());
        userEntity.setEmail(userDTO.getEmail());
        return userEntity;
    }
}
