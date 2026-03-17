package com.rajkamalsingh.orderservice.controller;

import com.rajkamalsingh.orderservice.model.Order;
import com.rajkamalsingh.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Show the order form
    @GetMapping("/orders/new")
    public String showForm(Model model) {
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    // Operation 1 - Save the order (INSERT)
    @PostMapping("/orders/save")
    public String saveOrder(@ModelAttribute Order order) {
        orderService.saveOrder(order);
        return "redirect:/orders/all";
    }

    // Operation 2 - View all orders (SELECT)
    @GetMapping("/orders/all")
    public String viewAll(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        return "orderList";
    }
}
