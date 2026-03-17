package com.rajkamalsingh.marketservice.service;

import com.rajkamalsingh.marketservice.model.MarketOrder;
import com.rajkamalsingh.marketservice.repository.MarketOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketOrderService {

    @Autowired
    private MarketOrderRepository marketOrderRepository;

    public MarketOrder placeOrder(MarketOrder marketOrder) {
        marketOrder.setStatus("PLACED");
        return marketOrderRepository.save(marketOrder);
    }

    public List<MarketOrder> getOrdersByOrderId(Long orderId) {
        return marketOrderRepository.findByOrderId(orderId);
    }

    public List<MarketOrder> getAllMarketOrders() {
        return marketOrderRepository.findAll();
    }
}
