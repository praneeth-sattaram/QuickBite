package com.food.QuickBite.service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.QuickBite.dto.CustomerReqDto;
import com.food.QuickBite.entity.Customer;
import com.food.QuickBite.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private final CustomerRepo customerRepo;
    
	public CustomerService(CustomerRepo customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}
	public void customerRegistration(CustomerReqDto customerReqDto) {
		Customer customer=new Customer();
		customer.setName(customerReqDto.getName());
		customer.setMobno(customerReqDto.getMob());
		customer.setMailId(customerReqDto.getMail());
		customer.setGender(customerReqDto.getGender());
		customerRepo.save(customer);
		
	}
	public void findCustomer(long mobno) {
		Customer customer=customerRepo.findByMobno(mobno).orElseThrow(()-> new RuntimeException());
	}

}