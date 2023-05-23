package com.springboot.rest.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.dao.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

		/*
		 * static List<Order> findByOrderDate(LocalDate orderDate) { // TODO
		 * Auto-generated method stub return null; } List<Order>
		 * findByOrderDateBetween(LocalDate startDate, LocalDate endDate);
		 */
}