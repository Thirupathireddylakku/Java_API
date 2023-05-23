package com.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.dao.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
