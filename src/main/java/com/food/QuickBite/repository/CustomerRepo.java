package com.food.QuickBite.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.QuickBite.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	Optional<Customer> findByMobno(long mobno);

	
	

}
