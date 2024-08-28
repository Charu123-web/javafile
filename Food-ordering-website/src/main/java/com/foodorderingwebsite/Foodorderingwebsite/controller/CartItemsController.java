package com.foodorderingwebsite.Foodorderingwebsite.controller;

import com.foodorderingwebsite.Foodorderingwebsite.entity.CartItems;
import com.foodorderingwebsite.Foodorderingwebsite.service.CartItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartItemsController {
   @Autowired
    private CartItemsService cartItemsService;
    @DeleteMapping("/cartItems/id/{cartItemsId}")
    public String deleteCartItemsBycartItemsId(@PathVariable("cartItemsId") Long cartItemsId){
        cartItemsService.deletecartItemsByCartItemsId(cartItemsId);
        return "CartItems deleted successfully!!";
    }


    @DeleteMapping("/clearCart/userId/{userId}")
    public String clearCart(@PathVariable("userId") Long userId){
        cartItemsService.clearCart(userId);
        return "Your cart is empty!!";
    }
    @GetMapping("/viewCart/userId/{userId}")
    public List<CartItems> viewCartItemsList(@PathVariable("userId")Long userId){
      return   cartItemsService.fetchCartItemsById(userId);
    }
}
