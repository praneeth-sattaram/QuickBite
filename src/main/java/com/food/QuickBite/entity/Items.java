package com.food.QuickBite.entity;

//import org.springframework.web.multipart.MultipartFile;

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
public Items(String name, String description, double price, int unit, FoodType foodType,
		Availability availability, int rating, int numberOfServes) {
	super();
	this.name = name;
	this.description = description;
	this.price = price;
	this.unit = unit;
	this.foodType = foodType;
	this.availability = availability;
	this.rating = rating;
	NumberOfServes = numberOfServes;
}

public Items() {
	super();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getUnit() {
	return unit;
}

public void setUnit(int unit) {
	this.unit = unit;
}

public FoodType getFoodType() {
	return foodType;
}

public void setFoodType(FoodType foodType) {
	this.foodType = foodType;
}

public Availability getAvailability() {
	return availability;
}

public void setAvailability(Availability availability) {
	this.availability = availability;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public int getNumberOfServes() {
	return NumberOfServes;
}

public void setNumberOfServes(int numberOfServes) {
	NumberOfServes = numberOfServes;
}
	
}
