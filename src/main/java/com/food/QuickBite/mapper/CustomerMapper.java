package com.food.QuickBite.mapper;

import org.springframework.stereotype.Component;

import com.food.QuickBite.dto.CustomerReqDto;
import com.food.QuickBite.entity.Customer;

@Component
public class CustomerMapper {


	    public static Customer toEntity(CustomerReqDto dto) {
	        if (dto == null) {
	            return null;
	        }

	        Customer customer = new Customer();
	        customer.setName(dto.getName());
	        customer.setMobno(dto.getMob());
	        customer.setMailId(dto.getMail());
	        customer.setGender(dto.getGender());

	        // Address, Orders, Cart are not mapped here
	        // because CustomerReqDto doesn't contain them

	        return customer;
	    }

	    // Entity → DTO
	    public static CustomerReqDto toDto(Customer customer) {
	        if (customer == null) {
	            return null;
	        }

	        CustomerReqDto dto = new CustomerReqDto();
	        dto.setName(customer.getName());
	        dto.setMob(customer.getMobno());
	        dto.setMail(customer.getMailId());
	        dto.setGender(customer.getGender());

	        return dto;
	    }
	}

	


