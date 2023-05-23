package com.springboot.rest.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.dao.Order;
import com.springboot.rest.service.UserService;

@RestController
@RequestMapping("/users")
public class Usercontroller {
	
	
	 private final UserService userService ;
	 
	    public Usercontroller(UserService userService) {
		super();
		this.userService = userService;
	}



		@GetMapping("/max-purchase")
	    public ResponseEntity<List<Order>> getUserWithMaxPurchase(@RequestParam("date") @DateTimeFormat(pattern = "dd MMM yyyy") LocalDate date) {
	        List<Order> userOrders = userService.getUserWithMaxPurchase(date);
	        if (!userOrders.isEmpty()) {
	            return ResponseEntity.ok(userOrders);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

}
