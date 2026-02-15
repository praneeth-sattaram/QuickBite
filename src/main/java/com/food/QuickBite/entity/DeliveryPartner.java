package com.food.QuickBite.entity;

import java.util.List;


import com.food.QuickBite.enums.DeliveryStatus;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

	@Enumerated(EnumType.STRING)
	private DeliveryStatus deliveryStatus;

	//private PartnerStatus status; 

}
