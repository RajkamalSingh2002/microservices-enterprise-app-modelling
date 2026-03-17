package com.rajkamalsingh.accounttransactionsservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account_transactions")
public class AccountTransaction {

    @Id
    private String id;

    private String accountId;
    private Long orderId;
    private String stockQuote;
    private int quantity;
    private String date;
    private String status;

    // Getters
    public String getId() { return id; }
    public String getAccountId() { return accountId; }
    public Long getOrderId() { return orderId; }
    public String getStockQuote() { return stockQuote; }
    public int getQuantity() { return quantity; }
    public String getDate() { return date; }
    public String getStatus() { return status; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setAccountId(String accountId) { this.accountId = accountId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }
    public void setStockQuote(String stockQuote) { this.stockQuote = stockQuote; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setDate(String date) { this.date = date; }
    public void setStatus(String status) { this.status = status; }
}
