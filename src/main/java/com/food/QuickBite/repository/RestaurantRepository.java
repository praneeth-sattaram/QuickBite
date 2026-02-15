package com.food.QuickBite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.QuickBite.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>{

}
