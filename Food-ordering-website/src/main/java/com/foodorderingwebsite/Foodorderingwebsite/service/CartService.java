package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Cart;
import com.foodorderingwebsite.Foodorderingwebsite.entity.CartItems;
import org.springframework.stereotype.Service;

@Service
public interface CartService {
   public CartItems addCartItems(Long itemsId, int cartItemQuantity, Long userId);
}
