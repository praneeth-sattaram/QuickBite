package com.food.QuickBite.entity;

import java.util.List;

import com.food.QuickBite.enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long mobno;
	private String mailId;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Orders> Orders;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Items> Cart;
	public Customer(String name, long mobno, String mailId, Gender gender, Address address, List<Orders> orders,
			List<Items> cart) {
		super();
		this.name = name;
		this.mobno = mobno;
		this.mailId = mailId;
		this.gender = gender;
		this.address = address;
		Orders = orders;
		Cart = cart;
	}
	
	
	
	
	public Customer() {
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
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Orders> getOrders() {
		return Orders;
	}
	public void setOrders(List<Orders> orders) {
		Orders = orders;
	}
	public List<Items> getCart() {
		return Cart;
	}
	public void setCart(List<Items> cart) {
		Cart = cart;
	}
	
	
	
}