package com.springboot.rest.repository;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.dao.Order;
import com.springboot.rest.dao.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<Order> findByOrderDate(LocalDate orderDate);
	  List<Order> findByCustomerAndOrderDate(User customer, LocalDate orderDate);
}
