package com.foodorderingwebsite.Foodorderingwebsite.controller;

import com.foodorderingwebsite.Foodorderingwebsite.entity.OrderDetails;
import com.foodorderingwebsite.Foodorderingwebsite.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderDetails")
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @PostMapping("/add")
    public String addOrderDetails(@RequestBody OrderDetails orderDetails) {
        orderDetailsService.addOrderDetails(orderDetails);
        return "Order Details added successfully!";
    }

    @DeleteMapping("/id/{orderDetailsId}")
    public String deleteOrderDetailsById(@PathVariable("orderDetailsId") Long orderDetailsId) {
        orderDetailsService.deleteOrderDetailsById(orderDetailsId);
        return "Order Details deleted successfully!";
    }

    @GetMapping("/userId/{userId}")
    public List<OrderDetails> getOrderDetailsByUserId(@PathVariable("userId") Long userId) {
        return orderDetailsService.getOrderDetailsByUserId(userId);
    }

    @GetMapping("/orderId/{orderId}")
    public OrderDetails getOrderDetailsByOrderId(@PathVariable("orderId") Long orderId) {
        return orderDetailsService.getOrderDetailsByOrderId(orderId);
    }
}
