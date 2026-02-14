package com.food.QuickBite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.QuickBite.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
