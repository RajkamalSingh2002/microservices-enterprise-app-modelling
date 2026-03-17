package com.rajkamalsingh.marketservice.repository;

import com.rajkamalsingh.marketservice.model.MarketOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MarketOrderRepository extends MongoRepository<MarketOrder, String> {

    List<MarketOrder> findByOrderId(Long orderId);
}
