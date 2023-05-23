package com.springboot.rest.dao;

import java.util.Locale.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private double price;
    private int quantity;
    
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    // Getters and setters
}
