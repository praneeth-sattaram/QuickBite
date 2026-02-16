package com.food.QuickBite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.food.QuickBite.dto.RestaurantReqDto;
import com.food.QuickBite.dto.RestaurantResponseDto;
import com.food.QuickBite.responseStructure.ResponseStructure;
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
	public ResponseEntity<ResponseStructure<RestaurantResponseDto>> restaurantRegistration(@RequestBody RestaurantReqDto reastaurantReqDto) {
		
		 RestaurantResponseDto restaurantResponseDto = restaurantService.restaurantRegistration(reastaurantReqDto); 
		 ResponseStructure<RestaurantResponseDto> rs = new ResponseStructure<>();
		 rs.setStatusCode(HttpStatus.CREATED.value());
		 rs.setMessage("Restaurant Created Successfully");
		 rs.setData(restaurantResponseDto);

		    return new ResponseEntity<>(rs, HttpStatus.CREATED);	
	}
	
	@GetMapping("/find")
	public ResponseEntity<ResponseStructure<RestaurantResponseDto>> findRestaurant(@RequestParam Long mobileNo) {
		
		RestaurantResponseDto restaurantResponseDto = restaurantService.findRestaurant(mobileNo);	
		ResponseStructure<RestaurantResponseDto> rs = new ResponseStructure<>();
	    rs.setStatusCode(HttpStatus.FOUND.value());
	    rs.setMessage("Restaurant Found Successfully");
	    rs.setData(restaurantResponseDto);

	    return new ResponseEntity<>(rs, HttpStatus.FOUND);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<RestaurantResponseDto>> deleteRestaurant(@RequestParam Long mobileNo) {
		
		RestaurantResponseDto restaurantResponseDto = restaurantService.deleteRestaurant(mobileNo);
		ResponseStructure<RestaurantResponseDto> rs = new ResponseStructure<>();
	    rs.setStatusCode(HttpStatus.OK.value());
	    rs.setMessage("Restaurant deleted Successfully");
	    rs.setData(restaurantResponseDto);
		
	    return new ResponseEntity<>(rs, HttpStatus.OK);
	    
	}
}
