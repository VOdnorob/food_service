package com.valentyn.odnorob.food_system.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_name")
    @NotBlank
    private String name;

    @Column(name = "user_surname")
    @NotBlank
    private String surname;

    @Column(name = "user_email")
    @NotBlank
    private String email;

    private List<Dish> myRecipe;


}
