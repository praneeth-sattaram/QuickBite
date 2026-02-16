package com.food.QuickBite.mapper;

import org.springframework.stereotype.Component;

import com.food.QuickBite.dto.DeliveryPartnerDto;
import com.food.QuickBite.entity.DeliveryPartner;

@Component
public class DeliveryPartnerMapper {
	
	public DeliveryPartner toEntity(DeliveryPartnerDto dto) {
		if (dto==null) {
			return null;
		}

		 DeliveryPartner dp=new DeliveryPartner();
		 dp.setName(dto.getName());
		 dp.setMob(dto.getMob());
		 dp.setEmail(dto.getEmail());
		 dp.setVehicle(dto.getVehicle());
		 
		 return dp;
	}
	
	public DeliveryPartnerDto toDto(DeliveryPartner dp) {
		
		if(dp==null) {
			return null;
		}
		
		DeliveryPartnerDto dto=new DeliveryPartnerDto();
		dto.setName(dp.getName());
		 dto.setMob(dp.getMob());
		 dto.setEmail(dp.getEmail());
		 dto.setVehicle(dp.getVehicle());
		 
		 return dto;
	}

}
