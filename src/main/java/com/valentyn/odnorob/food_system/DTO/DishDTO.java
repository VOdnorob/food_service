package com.valentyn.odnorob.food_system.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class DishDTO {

    private String nameOfDish;

    private String ingredients;

    private String step;

    private List steps;

}
