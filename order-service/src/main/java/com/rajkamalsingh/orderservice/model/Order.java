package com.rajkamalsingh.orderservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String date;
    private String stockQuote;
    private double price;
    private int quantity;
}
