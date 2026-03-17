package com.rajkamalsingh.orderservice.service;

import com.rajkamalsingh.orderservice.model.Order;
import com.rajkamalsingh.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    // Fees Service URL
    private final String FEES_SERVICE_URL = "http://localhost:8082/fees/record";

    // Operation 1 - Save order AND notify Fees Service
    public Order saveOrder(Order order) {

        // Step 1 - Save order to Orders DB
        Order savedOrder = orderRepository.save(order);

        // Step 2 - Send order data to Fees Service
        Map<String, Object> feeRequest = new HashMap<>();
        feeRequest.put("orderId", savedOrder.getOrderId());
        feeRequest.put("date", savedOrder.getDate());
        feeRequest.put("quantity", savedOrder.getQuantity());

        // This calls POST http://localhost:8082/fees/record
        restTemplate.postForObject(FEES_SERVICE_URL, feeRequest, Object.class);

        return savedOrder;
    }

    // Operation 2 - Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
