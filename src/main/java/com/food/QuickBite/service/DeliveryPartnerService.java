package com.food.QuickBite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.food.QuickBite.dto.DeliveryPartnerDto;
import com.food.QuickBite.entity.DeliveryPartner;
import com.food.QuickBite.exceptionHandler.DeliveryPartnerAlreadyExistsException;
import com.food.QuickBite.repository.DeliveryPartnerRepository;
import com.food.QuickBite.responseStructure.ResponseStructure;

@Service
public class DeliveryPartnerService {

	@Autowired
	private DeliveryPartnerRepository deliveryRepo;


	 public ResponseEntity<DeliveryPartner> register(DeliveryPartnerDto dto) {
		 
		 deliveryRepo.findByMob(dto.getMob()).ifPresent(dp-> new DeliveryPartnerAlreadyExistsException("Mobile already registered"));
		 
		 DeliveryPartner dp=new DeliveryPartner();
		 dp.setName(dto.getName());
		 dp.setMob(dto.getMob());
		 dp.setEmail(dto.getEmail());
		 dp.setVehicle(dto.getVehicle());
		 
		 DeliveryPartner savedPartner = deliveryRepo.save(dp);
		 
		 ResponseStructure<DeliveryPartner> rs = new ResponseStructure<>();
	        rs.setStatusCode(HttpStatus.CREATED.value());
	        rs.setMessage("Delivery Partner Registered Successfully");
	        rs.setData(savedPartner);
	        
	      return new ResponseEntity<>(savedPartner,HttpStatus.CREATED);
		 
	 }


}
