package com.rajkamalsingh.marketservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "market_orders")
public class MarketOrder {

    @Id
    private String id;

    private Long orderId;
    private String stockQuote;
    private int quantity;
    private double price;
    private String date;
    private String status;

    // Getters
    public String getId() { return id; }
    public Long getOrderId() { return orderId; }
    public String getStockQuote() { return stockQuote; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public String getDate() { return date; }
    public String getStatus() { return status; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }
    public void setStockQuote(String stockQuote) { this.stockQuote = stockQuote; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }
    public void setDate(String date) { this.date = date; }
    public void setStatus(String status) { this.status = status; }
}
