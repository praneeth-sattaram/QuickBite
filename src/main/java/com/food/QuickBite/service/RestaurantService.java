package com.food.QuickBite.service;


import org.springframework.stereotype.Service;

import com.food.QuickBite.dto.RestaurantReqDto;
import com.food.QuickBite.dto.RestaurantResponseDto;
import com.food.QuickBite.entity.Restaurant;
import com.food.QuickBite.exceptionHandler.RestaurantNotFound;
import com.food.QuickBite.mapper.RestaurantMapper;
import com.food.QuickBite.exceptionHandler.RestaurantAlreadyExistsException;
import com.food.QuickBite.repository.RestaurantRepository;

@Service
public class RestaurantService {

	private final RestaurantRepository restaurantRepository;
	private RestaurantMapper restaurantMapper;
	
	
	public RestaurantService(RestaurantRepository restaurantRepository, RestaurantMapper restaurantMapper) {
		super();
		this.restaurantRepository = restaurantRepository;
		this.restaurantMapper = restaurantMapper;
	}

	public RestaurantResponseDto restaurantRegistration( RestaurantReqDto restaurantReqDto) {
		restaurantRepository.findByMobNo(restaurantReqDto.getMob())
		.ifPresent( r -> new RestaurantAlreadyExistsException("Restaurant already exists with this mobile number"));
		Restaurant newRestaurant = restaurantMapper.toEntity(restaurantReqDto);
		restaurantRepository.save(newRestaurant);
		
		return restaurantMapper.toResponseDto(newRestaurant);	
	}

	public RestaurantResponseDto findRestaurant(Long mobileNo) {
		 Restaurant restaurant = restaurantRepository.findByMobNo(mobileNo)
				.orElseThrow( ()-> new RestaurantNotFound("Restaurant with this number doesnt exists"));	
		 
		 return restaurantMapper.toResponseDto(restaurant);
	}

	public RestaurantResponseDto deleteRestaurant(Long mobileNo) {
		 Restaurant restaurant = restaurantRepository.findByMobNo(mobileNo)
					.orElseThrow( ()-> new RestaurantNotFound("Restaurant with this number doesnt exists"));	
		restaurantRepository.delete(restaurant);
		
		return restaurantMapper.toResponseDto(restaurant);
	}
	
}
