package com.springboot.rest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.dao.Product;
import com.springboot.rest.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Product>> getProductCategoriesInLast3Months() {
        List<Product> categories = productService.getProductCategoriesInLast3Months();
        if (!categories.isEmpty()) {
            return ResponseEntity.ok(categories);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/top-selling")
    public ResponseEntity<List<Product>> getTopSellingProductsInCurrentMonth() {
        List<Product> products = productService.getTopSellingProductsInCurrentMonth();
        if (!products.isEmpty()) {
            return ResponseEntity.ok(products);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
