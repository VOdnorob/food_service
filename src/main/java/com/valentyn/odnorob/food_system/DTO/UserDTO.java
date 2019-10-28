package com.valentyn.odnorob.food_system.DTO;

import javax.validation.constraints.Email;
import java.util.List;

public class UserDTO {

    private String name;

    private String surname;

    @Email
    private String email;

    private List myRecipe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List getMyRecipe() {
        return myRecipe;
    }

    public void setMyRecipe(List myRecipe) {
        this.myRecipe = myRecipe;
    }
}
