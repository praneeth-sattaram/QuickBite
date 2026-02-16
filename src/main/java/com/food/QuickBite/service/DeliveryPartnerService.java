package com.food.QuickBite.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.food.QuickBite.dto.DeliveryPartnerDto;
import com.food.QuickBite.entity.DeliveryPartner;
import com.food.QuickBite.exceptionHandler.DeliveryPartnerAlreadyExistsException;
import com.food.QuickBite.exceptionHandler.DeliveryPartnerNotFoundException;
import com.food.QuickBite.mapper.DeliveryPartnerMapper;
import com.food.QuickBite.repository.DeliveryPartnerRepository;
import com.food.QuickBite.responseStructure.ResponseStructure;

@Service
public class DeliveryPartnerService {

	private final DeliveryPartnerRepository deliveryRepo;
	private final DeliveryPartnerMapper dpMapper;

	public DeliveryPartnerService(DeliveryPartnerRepository deliveryRepo, DeliveryPartnerMapper dpMapper) {
		super();
		this.deliveryRepo = deliveryRepo;
		this.dpMapper = dpMapper;
	}

	 public ResponseEntity<DeliveryPartnerDto> register(DeliveryPartnerDto dto) {
		 
		 deliveryRepo.findByMob(dto.getMob()).ifPresent(d-> {
		        throw new DeliveryPartnerAlreadyExistsException("Mobile already registered");
		    });
		 
		 DeliveryPartner dp=dpMapper.toEntity(dto);
		 
		 DeliveryPartner savedPartner = deliveryRepo.save(dp);
		 
		 DeliveryPartnerDto dpDto=dpMapper.toDto(savedPartner);
		 
		 ResponseStructure<DeliveryPartnerDto> rs = new ResponseStructure<>();
	        rs.setStatusCode(HttpStatus.CREATED.value());
	        rs.setMessage("Delivery Partner Registered Successfully");
	        rs.setData(dpDto);
	        
	      return new ResponseEntity<>(dpDto,HttpStatus.CREATED);
		 
	 }
	 
	 public ResponseEntity<ResponseStructure<DeliveryPartnerDto>> find(Long mob) {
		 
		 DeliveryPartner dp=deliveryRepo.findByMob(mob).orElseThrow(()->new DeliveryPartnerNotFoundException("No registered delivery partner found"));
		 
		 DeliveryPartnerDto dpDto=dpMapper.toDto(dp);
		 
		 ResponseStructure<DeliveryPartnerDto> rs = new ResponseStructure<>();
	        rs.setStatusCode(HttpStatus.OK.value());
	        rs.setMessage("Delivery Partner Found Successfully");
	        rs.setData(dpDto);
		 
	        return new ResponseEntity<>(rs, HttpStatus.OK);
	 
	 }
	 
	 public ResponseEntity<ResponseStructure<String>> delete(Long mob) {
		 
		 DeliveryPartner dp = deliveryRepo.findByMob(mob).orElseThrow(() ->new DeliveryPartnerNotFoundException("No registered delivery partner found"));

		    deliveryRepo.delete(dp);
		 ResponseStructure<String> rs = new ResponseStructure<>();
	        rs.setStatusCode(HttpStatus.OK.value());
	        rs.setMessage("Delivery Partner Deleted Successfully");
	        rs.setData("Deleted");
		 
		return new ResponseEntity<>(rs,HttpStatus.OK);
	 
	 }


}
