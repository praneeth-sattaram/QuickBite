package com.food.QuickBite.entity;

import org.springframework.web.multipart.MultipartFile;

import com.food.QuickBite.enums.Availability;
import com.food.QuickBite.enums.FoodType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private double price;
	private int unit;
	@Enumerated(EnumType.STRING)
	private FoodType foodType;
	private Availability availability;
	private int rating;
//	private MultipartFile image;
	private int NumberOfServes;
	
	
}
