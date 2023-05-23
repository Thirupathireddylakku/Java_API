package com.springboot.rest.dao;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private User customer;

    @ManyToMany
    @JoinTable(name = "order_products",
        joinColumns = @JoinColumn(name = "orderId"),
        inverseJoinColumns = @JoinColumn(name = "productId"))
    private List<Product> products;

    private int quantity;
    private LocalDate orderDate;
    private double orderValue;

    // Getters and setters
}
