package com.rajkamalsingh.feeservice.service;

import com.rajkamalsingh.feeservice.model.Fee;
import com.rajkamalsingh.feeservice.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FeeService {

    @Autowired
    private FeeRepository feeRepository;

    // Operation 1 - Record/log a fee (INSERT)
    public Fee recordFee(Fee fee) {
        // Business rule - fee is $0.50 per quantity
        double calculatedFee = fee.getQuantity() * 0.50;
        fee.setFeeAmount(calculatedFee);
        fee.setTotalFees(calculatedFee);
        return feeRepository.save(fee);
    }

    // Operation 2 - Get all fees by orderId (SELECT)
    public List<Fee> getFeesByOrderId(Long orderId) {
        return feeRepository.findByOrderId(orderId);
    }

    // Operation 3 - Get all fees (SELECT)
    public List<Fee> getAllFees() {
        return feeRepository.findAll();
    }
}
