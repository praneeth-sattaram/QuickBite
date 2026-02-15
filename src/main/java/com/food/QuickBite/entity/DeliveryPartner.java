package com.food.QuickBite.entity;

import java.util.List;

<<<<<<< HEAD

import com.food.QuickBite.enums.DeliveryStatus;


=======
import com.food.QuickBite.enums.DeliveryStatus;

import jakarta.persistence.CascadeType;
>>>>>>> 1ce05974822deb6587d4dc56e29ec3444b078375
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class DeliveryPartner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private long mob;
	private String email;
	private int rating;
	
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Orders> orders;
	private String vehicle;
<<<<<<< HEAD

	@Enumerated(EnumType.STRING)
	private DeliveryStatus deliveryStatus;

	//private PartnerStatus status; 
=======
	@Enumerated(EnumType.STRING)
	private DeliveryStatus deliveryStatus;
	//private PartnerStatus status;
	public DeliveryPartner(String name, long mob, String email, int rating, String address, List<Orders> orders,
			String vehicle, DeliveryStatus deliveryStatus) {
		super();
		this.name = name;
		this.mob = mob;
		this.email = email;
		this.rating = rating;
		this.address = address;
		this.orders = orders;
		this.vehicle = vehicle;
		this.deliveryStatus = deliveryStatus;
	}
	public DeliveryPartner() {
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
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	
>>>>>>> 1ce05974822deb6587d4dc56e29ec3444b078375

}
