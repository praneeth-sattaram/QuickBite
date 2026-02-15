package com.food.QuickBite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;



@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private double amount;
private String type;
private String Paymentstatus;
@OneToOne
private Orders orders;
public Payment() {
	super();
}
public Payment(double amount, String type, String paymentstatus, Orders order) {
	super();
	this.amount = amount;
	this.type = type;
	Paymentstatus = paymentstatus;
	this.orders = order;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getPaymentstatus() {
	return Paymentstatus;
}
public void setPaymentstatus(String paymentstatus) {
	Paymentstatus = paymentstatus;
}
public Orders getOrder() {
	return orders;
}
public void setOrder(Orders order) {
	this.orders = order;
}
	
	

}
