package com.food.QuickBite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.food.QuickBite.dto.DeliveryPartnerDto;
import com.food.QuickBite.entity.DeliveryPartner;
import com.food.QuickBite.responseStructure.ResponseStructure;
import com.food.QuickBite.service.DeliveryPartnerService;

@RestController
@RequestMapping("/deliveryPartner")
public class DeliveryPartnerController {

	@Autowired
	private DeliveryPartnerService deliveryPartnerService;
	
	
	@PostMapping("/register")
	public ResponseEntity<DeliveryPartner>  registerDeliveryPartner(@RequestBody DeliveryPartnerDto dto) {
		return deliveryPartnerService.register(dto);
		
	}
	
	@GetMapping("/find")
	public ResponseEntity<ResponseStructure<DeliveryPartner>>  findDeliveryPartner(@RequestParam long mob) {
		return deliveryPartnerService.find(mob);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<String>>  deleteDeliveryPartner(@RequestParam long mob) {
		return deliveryPartnerService.delete(mob);
		
	}
	
}
