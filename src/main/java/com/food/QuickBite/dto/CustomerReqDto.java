package com.food.QuickBite.dto;

import com.food.QuickBite.enums.Gender;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class CustomerReqDto {

	private String name;
	private long mob;
	private String mail;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
}
