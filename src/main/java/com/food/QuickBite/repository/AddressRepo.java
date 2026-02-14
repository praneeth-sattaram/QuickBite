package com.food.QuickBite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.QuickBite.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
