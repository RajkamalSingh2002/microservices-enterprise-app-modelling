package com.rajkamalsingh.feeservice.repository;

import com.rajkamalsingh.feeservice.model.Fee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeeRepository extends JpaRepository<Fee, Long> {

    // Find all fees by orderId
    List<Fee> findByOrderId(Long orderId);
}
