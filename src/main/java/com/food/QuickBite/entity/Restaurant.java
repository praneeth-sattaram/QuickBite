package com.food.QuickBite.entity;

import java.util.List;

import com.food.QuickBite.enums.RestaurantStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private long mobNo;
	private String mailId;
	private String address;
	private List<Items> menu;
	// private Status (enum)
	private RestaurantStatus resStatus;
	private Double ratings;
	private String Description;
	private List<Order> orders;
	private Double packagingFees;
	//private type (enum)
	
	
	

}
