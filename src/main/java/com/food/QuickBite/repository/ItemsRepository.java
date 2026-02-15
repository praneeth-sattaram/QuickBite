package com.food.QuickBite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.QuickBite.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer>{

}
