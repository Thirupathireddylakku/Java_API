package com.springboot.rest.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.rest.dao.Product;
import com.springboot.rest.repository.ProductRepository;

@Service
public class ProductService {
	  private final ProductRepository productRepository;

	    public ProductService(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }

	    public List<Product> getProductCategoriesInLast3Months() {
	        LocalDate startDate = LocalDate.now().minusMonths(3);
	        LocalDate endDate = LocalDate.now();

	        List<Product> categories = productRepository.findCategoriesBySoldDateRange(startDate, endDate);

	   
	      
	       
	        
	       
	        return categories;
	        
	        
			/*
			 * return categories.stream() .map(Product::getProductName)
			 * .collect(Collectors.toList());
			 */
	    }

	    public List<Product> getTopSellingProductsInCurrentMonth() {
	        LocalDate startDate = LocalDate.now().withDayOfMonth(1);
	        LocalDate endDate = LocalDate.now();

	        return productRepository.findCategoriesBySoldDateRange(startDate, endDate);
	    }
}

