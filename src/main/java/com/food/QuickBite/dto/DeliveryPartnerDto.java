package com.food.QuickBite.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DeliveryPartnerDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	
	private Long mob;
	
	private String mail;
	
	private String vehicle;
}
