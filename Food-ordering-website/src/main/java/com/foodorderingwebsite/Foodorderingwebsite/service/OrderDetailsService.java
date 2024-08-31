package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.OrderDetails;

import java.util.List;

public interface OrderDetailsService {

    void addOrderDetails(OrderDetails orderDetails);

    void deleteOrderDetailsById(Long orderDetailsId);

    List<OrderDetails> getOrderDetailsByUserId(Long userId);

    OrderDetails getOrderDetailsByOrderId(Long orderId);
}
