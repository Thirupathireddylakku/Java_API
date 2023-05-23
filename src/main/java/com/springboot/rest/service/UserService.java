package com.springboot.rest.service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;


import org.springframework.stereotype.Service;

import com.springboot.rest.dao.Order;
import com.springboot.rest.dao.User;
import com.springboot.rest.repository.UserRepository;

@Service
public class UserService   {
	 private final UserRepository userRepository;

	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public List<Order> getUserWithMaxPurchase(LocalDate orderDate) {
	        List<Order> orders = userRepository.findByOrderDate(orderDate);
	        User userWithMaxPurchase = null;
	        if (userWithMaxPurchase != null) {
	            return userRepository.findByCustomerAndOrderDate(userWithMaxPurchase, orderDate);
	        } else {
	            return Collections.emptyList();
	        }
	    }
	
}
