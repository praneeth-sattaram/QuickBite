package com.food.QuickBite.service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.QuickBite.dto.RestaurantReqDto;
import com.food.QuickBite.entity.Restaurant;
import com.food.QuickBite.repository.RestaurantRepository;
import com.food.QuickBite.util.LocationCordinates;

@Service
public class RestaurantService {
	
	@Autowired
	private final RestaurantRepository restaurantRepository;

	public RestaurantService(RestaurantRepository restaurantRepository) {
		super();
		this.restaurantRepository = restaurantRepository;
	}
	
	public void restaurantRegistration( RestaurantReqDto restaurantReqDto) {
		Restaurant newRestaurant = new Restaurant();
		newRestaurant.setName(restaurantReqDto.getName());
		newRestaurant.setMobNo(restaurantReqDto.getMob());
		newRestaurant.setMailId(restaurantReqDto.getMail());
		newRestaurant.setDescription(restaurantReqDto.getDescription());
		newRestaurant.setPackagingFees(restaurantReqDto.getPackagingFees());
		newRestaurant.setFoodType(restaurantReqDto.getFoodType());
		
		restaurantRepository.save(newRestaurant);
		
	}

	public void findRestaurant(Long mobileNo) {
		Restaurant restaurant = restaurantRepository.findByMobNo(mobileNo)
				.orElseThrow( ()-> new RuntimeErrorException(null));
		
		
		
	}
	
}
