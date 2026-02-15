package com.food.QuickBite.entity;

import java.time.LocalDate;
import java.util.List;

import com.food.QuickBite.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private OrderStatus orderStatus;
	@ManyToOne
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
	
	@OneToOne
	private Customer customer;
	private double cost;
	@OneToMany
	private List<Items> cart;
	private String pickup_Address;
	private int otp;
	@OneToOne
	private DeliveryPartner deliveryPartner;
	@OneToOne
	private Payment payment;
	private int estimatedTime; // in Minutes
	private int distance;
	private int discount;
	private String couponCode;
	private String deliveryInstructions;
	private LocalDate date;
	public Orders(OrderStatus orderStatus, Restaurant restaurant, Customer customer, double cost,
			List<Items> cart, String pickup_Address, int otp, DeliveryPartner deliveryPartner, Payment payment,
			int estimatedTime, int distance, int discount, String couponCode, String deliveryInstructions,
			LocalDate date) {
		super();
		this.orderStatus = orderStatus;
		this.restaurant = restaurant;
		this.customer = customer;
		this.cost = cost;
		this.cart = cart;
		this.pickup_Address = pickup_Address;
		this.otp = otp;
		this.deliveryPartner = deliveryPartner;
		this.payment = payment;
		this.estimatedTime = estimatedTime;
		this.distance = distance;
		this.discount = discount;
		this.couponCode = couponCode;
		this.deliveryInstructions = deliveryInstructions;
		this.date = date;
	}
	public Orders() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public List<Items> getCart() {
		return cart;
	}
	public void setCart(List<Items> cart) {
		this.cart = cart;
	}
	public String getPickup_Address() {
		return pickup_Address;
	}
	public void setPickup_Address(String pickup_Address) {
		this.pickup_Address = pickup_Address;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public DeliveryPartner getDeliveryPartner() {
		return deliveryPartner;
	}
	public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
		this.deliveryPartner = deliveryPartner;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public int getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getDeliveryInstructions() {
		return deliveryInstructions;
	}
	public void setDeliveryInstructions(String deliveryInstructions) {
		this.deliveryInstructions = deliveryInstructions;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	
	
	
}