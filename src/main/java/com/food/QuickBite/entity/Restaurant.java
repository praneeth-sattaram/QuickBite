package com.food.QuickBite.entity;

import java.util.List;

import com.food.QuickBite.enums.FoodType;
import com.food.QuickBite.enums.RestaurantStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private long mobNo;
	
	private String mailId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Items_id")
	private List<Items> menu;
	
	private RestaurantStatus resStatus;
	
	private Double ratings;
	
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Orders_id")
	private List<Orders> orders;
	
	private Double packagingFees;
	
	@Enumerated(EnumType.STRING)
	private FoodType foodType;
	
	@Enumerated(EnumType.STRING)
	private RestaurantStatus restaurantStatus;

	public Restaurant(String name, long mobNo, String mailId, Address address, List<Items> menu,
			RestaurantStatus resStatus, Double ratings, String description, List<Orders> orders, Double packagingFees,
			FoodType foodType, RestaurantStatus restaurantStatus) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.mailId = mailId;
		this.address = address;
		this.menu = menu;
		this.resStatus = resStatus;
		this.ratings = ratings;
		this.description = description;
		this.orders = orders;
		this.packagingFees = packagingFees;
		this.foodType = foodType;
		this.restaurantStatus = restaurantStatus;
	}

	public Restaurant() {
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

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Items> getMenu() {
		return menu;
	}

	public void setMenu(List<Items> menu) {
		this.menu = menu;
	}

	public RestaurantStatus getResStatus() {
		return resStatus;
	}

	public void setResStatus(RestaurantStatus resStatus) {
		this.resStatus = resStatus;
	}

	public Double getRatings() {
		return ratings;
	}

	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Double getPackagingFees() {
		return packagingFees;
	}

	public void setPackagingFees(Double packagingFees) {
		this.packagingFees = packagingFees;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public RestaurantStatus getRestaurantStatus() {
		return restaurantStatus;
	}

	public void setRestaurantStatus(RestaurantStatus restaurantStatus) {
		this.restaurantStatus = restaurantStatus;
	}
	
	
	

}
