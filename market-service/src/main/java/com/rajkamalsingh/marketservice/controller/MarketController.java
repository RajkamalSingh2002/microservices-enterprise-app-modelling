package com.rajkamalsingh.marketservice.controller;

import com.rajkamalsingh.marketservice.model.MarketOrder;
import com.rajkamalsingh.marketservice.service.MarketOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/market")
public class MarketController {

    @Autowired
    private MarketOrderService marketOrderService;

    @PostMapping("/place")
    public MarketOrder placeOrder(@RequestBody MarketOrder marketOrder) {
        return marketOrderService.placeOrder(marketOrder);
    }

    @GetMapping("/status/{orderId}")
    public List<MarketOrder> getOrderStatus(@PathVariable Long orderId) {
        return marketOrderService.getOrdersByOrderId(orderId);
    }

    @GetMapping("/all")
    public List<MarketOrder> getAllMarketOrders() {
        return marketOrderService.getAllMarketOrders();
    }
}
