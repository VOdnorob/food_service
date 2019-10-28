package com.valentyn.odnorob.food_system.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "dishes")
@Setter
@Getter
public class Dish {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name_of_dish")
    @NotBlank
    private String nameOfDish;

    @Column(name = "ingredients")
    @NotBlank
    private String ingredients;

    @Column(name = "step")
    @NotBlank
    private String step;

    @Column(name = "steps")
    @NotBlank
    private List steps;

    @Column(name = "description")
    private Optional<String> description;

}
