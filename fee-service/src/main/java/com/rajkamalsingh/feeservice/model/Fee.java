package com.rajkamalsingh.feeservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "fees")
@Data
public class Fee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feeId;

    private Long orderId;
    private String date;
    private int quantity;
    private double feeAmount;
    private double totalFees;
}
