package com.springboot.rest.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.dao.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
   // List<Product> findByCategoryInAndOrder_DateBetween(List<Category> categories, LocalDate startDate, LocalDate endDate);
List<Product> findCategoriesBySoldDateRange( LocalDate startDate, LocalDate endDate);
}
