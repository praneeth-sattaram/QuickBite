package com.food.QuickBite.dto;

import com.food.QuickBite.enums.FoodType;
import com.food.QuickBite.util.LocationCordinates;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class RestaurantReqDto {
	
	private String name;
	private long mob;
	private String mail;
	private LocationCordinates locationCordinates;
	private String description;
	private double packagingFees;
	@Enumerated(EnumType.STRING)
	private FoodType foodType;
	
	
	public RestaurantReqDto(String name, long mob, String mail, LocationCordinates locationCordinates,
			String description, double packagingFees, FoodType foodType) {
		super();
		this.name = name;
		this.mob = mob;
		this.mail = mail;
		this.locationCordinates = locationCordinates;
		this.description = description;
		this.packagingFees = packagingFees;
		this.foodType = foodType;
	}
	public RestaurantReqDto() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public LocationCordinates getLocationCordinates() {
		return locationCordinates;
	}
	public void setLocationCordinates(LocationCordinates locationCordinates) {
		this.locationCordinates = locationCordinates;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPackagingFees() {
		return packagingFees;
	}
	public void setPackagingFees(double packagingFees) {
		this.packagingFees = packagingFees;
	}
	public FoodType getFoodType() {
		return foodType;
	}
	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
	

}
