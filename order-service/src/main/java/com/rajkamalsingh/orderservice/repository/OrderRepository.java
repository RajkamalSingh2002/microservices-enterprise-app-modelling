package com.rajkamalsingh.orderservice.repository;

import com.rajkamalsingh.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
