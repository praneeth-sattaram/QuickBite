package com.food.QuickBite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.food.QuickBite.dto.CustomerReqDto;
import com.food.QuickBite.service.CustomerService;

@RestController
@RequestMapping("/customer")

public class CustomerController {
	@Autowired
	private final CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@PostMapping("/register")
	public void customerRegistration(@RequestBody CustomerReqDto customerReqDto) {
		customerService.customerRegistration(customerReqDto);
		
	}
	@GetMapping("/find")
	public void findCustomer(@RequestParam long mob) {
		customerService.findCustomer(mob);
		
	}
}
