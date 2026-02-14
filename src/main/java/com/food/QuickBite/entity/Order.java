package com.food.QuickBite.entity;

import java.time.LocalDate;
import java.util.List;

import com.food.QuickBite.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {
	@Id
	private int id;
	private OrderStatus prderStatus;
	private String restaurant;
	private Customer customer;
	private double cost;
	private List<Items> cart;
	private String pickup_Address;
	private int otp;
	private DeliveryPartner deliveryPartner;
	private Payment payment;
	private int estimatedTime; // in Minutes
	private int distance;
	private int discount;
	private String couponCode;
	private String deliveryInstructions;
	private LocalDate date;
	

}
