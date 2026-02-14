package com.food.QuickBite.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DeliveryPartner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private long mob;
	private String email;
	private int rating;
	private Address address;
	private List<Order> orders;
	private String vehicle;
	//private PartnerStatus status; 
	

}
