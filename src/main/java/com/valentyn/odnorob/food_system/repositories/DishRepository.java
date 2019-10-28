package com.valentyn.odnorob.food_system.repositories;

import com.valentyn.odnorob.food_system.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {

}
