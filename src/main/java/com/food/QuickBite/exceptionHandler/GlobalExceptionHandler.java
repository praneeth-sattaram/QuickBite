package com.food.QuickBite.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.food.QuickBite.responseStructure.ResponseStructure;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomerAlreadyExistsException.class)
	public ResponseEntity<ResponseStructure<String>> customerAlreadyExistsException(CustomerAlreadyExistsException cust){
		 ResponseStructure<String> rs = new ResponseStructure<>();
	        rs.setStatusCode(HttpStatus.CONFLICT.value());
	        rs.setMessage("Customer Already Registered Successfully");
	        rs.setData(cust.getMessage());
	        return new ResponseEntity<>(rs,HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> CustomerNotFoundException(CustomerNotFoundException cust){
		 ResponseStructure<String> rs = new ResponseStructure<>();
	        rs.setStatusCode(HttpStatus.NOT_FOUND.value());
	        rs.setMessage("Customer Not Found with this Mobile Number");
	        rs.setData(cust.getMessage());
	        return new ResponseEntity<>(rs,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(RestaurantAlreadyExistsException.class)
	public ResponseEntity<ResponseStructure<String>> restaurantAlreadyExistsException(RestaurantAlreadyExistsException r){
		 ResponseStructure<String> rs = new ResponseStructure<>();
	        rs.setStatusCode(HttpStatus.CONFLICT.value());
	        rs.setMessage("Restaurant Already Registered Successfully");
	        rs.setData(r.getMessage());
	        return new ResponseEntity<>(rs,HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(RestaurantNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> deliveryParnterNotFoundException(RestaurantNotFoundException r){
		 ResponseStructure<String> rs = new ResponseStructure<>();
	        rs.setStatusCode(HttpStatus.NOT_FOUND.value());
	        rs.setMessage("Restaurant Not Found with this Mobile Number");
	        rs.setData(r.getMessage());
	        return new ResponseEntity<>(rs,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DeliveryPartnerAlreadyExistsException.class)
	public ResponseEntity<ResponseStructure<String>> deliveryParnterAlreadyExistsException(DeliveryPartnerAlreadyExistsException dp){
		 ResponseStructure<String> rs = new ResponseStructure<>();
	        rs.setStatusCode(HttpStatus.CONFLICT.value());
	        rs.setMessage("Delivery Partner Already Registered Successfully");
	        rs.setData(dp.getMessage());
	        return new ResponseEntity<>(rs,HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(DeliveryPartnerNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> deliveryParnterNotFoundException(DeliveryPartnerNotFoundException dp){
		 ResponseStructure<String> rs = new ResponseStructure<>();
	        rs.setStatusCode(HttpStatus.NOT_FOUND.value());
	        rs.setMessage("Delivery Partner Not Found with this Mobile Number");
	        rs.setData(dp.getMessage());
	        return new ResponseEntity<>(rs,HttpStatus.NOT_FOUND);
	}

}
