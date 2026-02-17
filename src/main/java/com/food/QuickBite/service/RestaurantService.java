package com.food.QuickBite.service;


import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.food.QuickBite.dto.RestaurantReqDto;
import com.food.QuickBite.dto.RestaurantResponseDto;
import com.food.QuickBite.entity.Address;
import com.food.QuickBite.entity.Restaurant;
import com.food.QuickBite.exceptionHandler.RestaurantNotFoundException;
import com.food.QuickBite.mapper.RestaurantMapper;
import com.food.QuickBite.exceptionHandler.RestaurantAlreadyExistsException;
import com.food.QuickBite.repository.RestaurantRepository;

@Service
public class RestaurantService {

	private final RestaurantRepository restaurantRepository;
	private RestaurantMapper restaurantMapper;
	private RestTemplate restTemplate;
	
	
	public RestaurantService(RestaurantRepository restaurantRepository, RestaurantMapper restaurantMapper,
			RestTemplate restTemplate) {
		super();
		this.restaurantRepository = restaurantRepository;
		this.restaurantMapper = restaurantMapper;
		this.restTemplate = restTemplate;
	}

	public RestaurantResponseDto restaurantRegistration( RestaurantReqDto restaurantReqDto) {
		restaurantRepository.findByMobNo(restaurantReqDto.getMob())
		.ifPresent( r -> new RestaurantAlreadyExistsException("Restaurant already exists with this mobile number"));
		Restaurant newRestaurant = restaurantMapper.toEntity(restaurantReqDto);
		
		Map response = restTemplate.getForObject("https://us1.locationiq.com/v1/reverse?key=pk.0130f4f7289f4a4e776726125a2917ac&lat= "+restaurantReqDto
				.getLocationCordinates().getLatitude()+"&lon="+restaurantReqDto
				.getLocationCordinates().getLongitude()+"&format=json&", Map.class);
		
		Map<String, String> addressResponse = (Map) response.get("address");
		
		Address address = new Address();
		
		address.setCity(addressResponse.get("city"));
		address.setState(addressResponse.get("state"));
		address.setCountry(addressResponse.get("country"));
		address.setPincode(Integer.parseInt(addressResponse.get("postcode")));
		
		
		
		restaurantRepository.save(newRestaurant);
		
		return restaurantMapper.toResponseDto(newRestaurant);	
	}

	public RestaurantResponseDto findRestaurant(Long mobileNo) {
		 Restaurant restaurant = restaurantRepository.findByMobNo(mobileNo)
				.orElseThrow( ()-> new RestaurantNotFoundException("Restaurant with this number doesnt exists"));	
		 
		 return restaurantMapper.toResponseDto(restaurant);
	}

	public RestaurantResponseDto deleteRestaurant(Long mobileNo) {
		 Restaurant restaurant = restaurantRepository.findByMobNo(mobileNo)
					.orElseThrow( ()-> new RestaurantNotFoundException("Restaurant with this number doesnt exists"));	
		restaurantRepository.delete(restaurant);
		
		return restaurantMapper.toResponseDto(restaurant);
	}
	
}
