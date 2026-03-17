package com.rajkamalsingh.feeservice.controller;

import com.rajkamalsingh.feeservice.model.Fee;
import com.rajkamalsingh.feeservice.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/fees")
public class FeeController {

    @Autowired
    private FeeService feeService;

    // Operation 1 - Record a fee (INSERT)
    // Orders Service will call this endpoint
    @PostMapping("/record")
    public Fee recordFee(@RequestBody Fee fee) {
        return feeService.recordFee(fee);
    }

    // Operation 2 - Get fees by order ID (SELECT)
    @GetMapping("/{orderId}")
    public List<Fee> getFeesByOrder(@PathVariable Long orderId) {
        return feeService.getFeesByOrderId(orderId);
    }

    // Operation 3 - Get all fees (SELECT)
    @GetMapping("/all")
    public List<Fee> getAllFees() {
        return feeService.getAllFees();
    }
}
