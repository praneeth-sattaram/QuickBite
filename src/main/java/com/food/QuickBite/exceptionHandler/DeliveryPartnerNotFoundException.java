package com.food.QuickBite.exceptionHandler;

public class DeliveryPartnerNotFoundException extends RuntimeException{
	
	public DeliveryPartnerNotFoundException(String message) {
		super(message);
	}

}
