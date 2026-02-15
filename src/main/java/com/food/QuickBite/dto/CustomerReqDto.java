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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "CustomerReqDto [name=" + name + ", mob=" + mob + ", mail=" + mail + ", gender=" + gender + "]";
	}
	public CustomerReqDto(String name, long mob, String mail, Gender gender) {
		super();
		this.name = name;
		this.mob = mob;
		this.mail = mail;
		this.gender = gender;
	}
	public CustomerReqDto() {
		super();
	}
	
}
