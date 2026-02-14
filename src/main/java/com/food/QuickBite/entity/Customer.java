package com.food.QuickBite.entity;

import java.util.List;

import com.food.QuickBite.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long mobno;
	private String mailId;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String address;
	private List<Order> Orders;
	private List<Items> Cart;
	
}