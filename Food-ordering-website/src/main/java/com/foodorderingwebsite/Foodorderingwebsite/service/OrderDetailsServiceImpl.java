package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.OrderDetails;
import com.foodorderingwebsite.Foodorderingwebsite.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public void addOrderDetails(OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);
    }

    @Override
    public void deleteOrderDetailsById(Long orderDetailsId) {
        orderDetailsRepository.deleteById(orderDetailsId);
    }

    @Override
    public List<OrderDetails> getOrderDetailsByUserId(Long userId) {
        return orderDetailsRepository.findOrderDetailsByUserId(userId);
    }

    @Override
    public OrderDetails getOrderDetailsByOrderId(Long orderId) {
        return orderDetailsRepository.findById(orderId).orElse(null);
    }
}
