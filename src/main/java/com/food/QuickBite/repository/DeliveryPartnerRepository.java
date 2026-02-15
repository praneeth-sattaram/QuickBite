package com.food.QuickBite.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.QuickBite.entity.DeliveryPartner;

public interface DeliveryPartnerRepository extends JpaRepository<DeliveryPartner, Integer> {

	 Optional<DeliveryPartner> findByMob(Long mob);

}
