package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Cart;
import com.foodorderingwebsite.Foodorderingwebsite.entity.CartItems;
import com.foodorderingwebsite.Foodorderingwebsite.entity.User;
import com.foodorderingwebsite.Foodorderingwebsite.repository.CartItemsRepository;
import com.foodorderingwebsite.Foodorderingwebsite.repository.CartRepository;
import com.foodorderingwebsite.Foodorderingwebsite.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemsServiceImpl implements CartItemsService {
    @Autowired
    private   CartItemsRepository cartItemsRepository;
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserRepository userRepository;


    @Override
    public void deletecartItemsByCartItemsId(Long cartItemsId) {
        cartItemsRepository.deleteById(cartItemsId);
    }

    @Override
    @Transactional
    public void clearCart(Long userId) {
       User user = userRepository.getById(userId);
        Cart cart = cartRepository.findByUser(user);
        cartItemsRepository.deleteCartItemsByCart(cart);
    }

    @Override
    public List<CartItems> fetchCartItemsById(Long userId) {
        User user = userRepository.getById(userId);
        Cart cart = cartRepository.findByUser(user);
       return cartItemsRepository.findCartItemsByCart(cart);
    }
}

