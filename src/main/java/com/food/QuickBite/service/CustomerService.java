package com.food.QuickBite.service;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.food.QuickBite.dto.CustomerReqDto;
import com.food.QuickBite.dto.DeliveryPartnerDto;
import com.food.QuickBite.entity.Customer;
import com.food.QuickBite.entity.DeliveryPartner;
import com.food.QuickBite.exceptionHandler.CustomerAlreadyExistsException;
import com.food.QuickBite.exceptionHandler.CustomerNotFoundException;
import com.food.QuickBite.mapper.CustomerMapper;
import com.food.QuickBite.repository.CustomerRepo;
import com.food.QuickBite.responseStructure.ResponseStructure;

@Service
public class CustomerService {
	
	private final CustomerRepo customerRepo;
	private final CustomerMapper customerMapper;
    
	
	public CustomerService(CustomerRepo customerRepo, CustomerMapper customerMapper) {
		super();
		this.customerRepo = customerRepo;
		this.customerMapper = customerMapper;
	}
	public ResponseStructure<Customer> register(CustomerReqDto dto) {

	    customerRepo.findByMobno(dto.getMob()).ifPresent(c ->  { throw new CustomerAlreadyExistsException("Mobile already registered");
	    });

	    Customer customer = customerMapper.toEntity(dto);

	    Customer savedCustomer = customerRepo.save(customer);

	    CustomerReqDto customerDto = customerMapper.toDto(savedCustomer);
	    ResponseStructure<CustomerReqDto> rs = new ResponseStructure<>();
	    rs.setStatusCode(HttpStatus.CREATED.value());
	    rs.setMessage("Customer Registered Successfully");
	    rs.setData(customerDto);

	    return rs;
	}
	public ResponseStructure<Customer> findCustomerByMobno(long mobno) {

        Customer customer = customerRepo.findByMobno(mobno).orElseThrow(() ->new CustomerNotFoundException("Customer Not Found"));

        ResponseStructure<Customer> rs = new ResponseStructure<>();
        rs.setStatusCode(HttpStatus.OK.value());
        rs.setMessage("Customer Found Successfully");
        rs.setData(customer);

        return rs;
    }
	public ResponseStructure<Customer> deleteCustomerByMobno(long mobno) {

		 

		 Customer customer = customerRepo.findByMobno(mobno).orElseThrow(() ->new CustomerNotFoundException("Customer Not Found"));

		  customerRepo.delete(customer);

		  ResponseStructure<Customer> rs = new ResponseStructure<>();
		  rs.setStatusCode(HttpStatus.OK.value());
		   rs.setMessage("Customer Deleted Successfully");
		    rs.setData(customer);

		    return rs;
		    }
		
	}




