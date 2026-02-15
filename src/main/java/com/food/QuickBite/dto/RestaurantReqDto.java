package com.food.QuickBite.dto;

import com.food.QuickBite.enums.FoodType;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class RestaurantReqDto {
	private String name;
	private long mob;
	private String mail;
	//private LocationCoordinate lc;
	private String description;
	private double packagingFees;
	@Enumerated(EnumType.STRING)
	private FoodType foodType;
	//private type enum;

}
