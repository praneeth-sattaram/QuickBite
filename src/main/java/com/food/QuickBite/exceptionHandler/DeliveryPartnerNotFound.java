package com.food.QuickBite.exceptionHandler;

public class DeliveryPartnerNotFound extends RuntimeException{
	
	public DeliveryPartnerNotFound(String message) {
		super(message);
	}

}
