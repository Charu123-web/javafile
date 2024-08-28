package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.CartItems;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartItemsService {


public void deletecartItemsByCartItemsId(Long cartItemsId);


  public  void clearCart(Long userId);

 public List<CartItems> fetchCartItemsById(Long userId);
}
