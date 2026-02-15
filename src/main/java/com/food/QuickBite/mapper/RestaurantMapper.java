package com.food.QuickBite.mapper;

	import org.springframework.stereotype.Component;

import com.food.QuickBite.dto.RestaurantReqDto;
import com.food.QuickBite.dto.RestaurantResponseDto;
import com.food.QuickBite.entity.Restaurant;

	@Component
	public class RestaurantMapper {

	    // ReqDto → Entity
	    public Restaurant toEntity(RestaurantReqDto dto) {

	        if (dto == null) {
	            return null;
	        }
	        Restaurant restaurant = new Restaurant();
	        restaurant.setName(dto.getName());
	        restaurant.setMobNo(dto.getMob());
	        restaurant.setMailId(dto.getMail());
	        restaurant.setDescription(dto.getDescription());
	        restaurant.setPackagingFees(dto.getPackagingFees());
	        restaurant.setFoodType(dto.getFoodType());

	        return restaurant;
	    }

	    //Entity → ResponseDto
	    public RestaurantResponseDto toResponseDto(Restaurant restaurant) {

	        if (restaurant == null) {
	            return null;
	        }

	        RestaurantResponseDto dto = new RestaurantResponseDto();
	        dto.setName(restaurant.getName());
	        dto.setMob(restaurant.getMobNo());
	        dto.setMail(restaurant.getMailId());
	        dto.setDescription(restaurant.getDescription());
	        dto.setPackagingFees(restaurant.getPackagingFees());
	        dto.setFoodType(restaurant.getFoodType());

	        return dto;
	    }

	}
	

