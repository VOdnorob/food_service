package com.valentyn.odnorob.food_system.mapper;

import com.valentyn.odnorob.food_system.DTO.DishDTO;
import com.valentyn.odnorob.food_system.entity.Dish;
import org.springframework.stereotype.Service;

@Service
public class DishMapper {

    public Dish mapToDish(DishDTO dishDTO){
        Dish dish = new Dish();
        dish.setNameOfDish(dishDTO.getNameOfDish());
        dish.setIngredients(dishDTO.getIngredients());
        dish.setStep(dishDTO.getStep());
        return dish;
    }
}
