package com.food.QuickBite.entity;

import java.util.List;

<<<<<<< HEAD
import com.food.QuickBite.enums.DeliveryStatus;

=======
>>>>>>> 1f85e587c5a014d4157d0db7bdc3f04563365668
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DeliveryPartner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private long mob;
	private String email;
	private int rating;
	private Address address;
	private List<Order> orders;
	private String vehicle;
<<<<<<< HEAD
	@Enumerated(EnumType.STRING)
	private DeliveryStatus deliveryStatus;
=======
	//private PartnerStatus status; 
>>>>>>> 1f85e587c5a014d4157d0db7bdc3f04563365668
	

}
