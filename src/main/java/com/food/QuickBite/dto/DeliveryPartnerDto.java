package com.food.QuickBite.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DeliveryPartnerDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;

	private Long mob;
	
    private String Email;
	
	private String vehicle;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMob() {
		return mob;
	}

	public void setMob(Long mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public DeliveryPartnerDto(String name, Long mob, String email, String vehicle) {
		super();
		this.name = name;
		this.mob = mob;
		Email = email;
		this.vehicle = vehicle;
	}

	public DeliveryPartnerDto() {
		super();
	}
	
}