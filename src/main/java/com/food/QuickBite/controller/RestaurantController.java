package com.food.QuickBite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.QuickBite.dto.RestaurantReqDto;
import com.food.QuickBite.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private final RestaurantService restaurantService;
	
	public RestaurantController(RestaurantService restaurantService) {
		super();
		this.restaurantService = restaurantService;
	}

	@PostMapping("/registration")
	public void restaurantRegistration(@RequestBody RestaurantReqDto reastaurantReqDto) {
		restaurantService.restaurantRegistration(reastaurantReqDto);
	}
}
