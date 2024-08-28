package com.foodorderingwebsite.Foodorderingwebsite.controller;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Cart;
import com.foodorderingwebsite.Foodorderingwebsite.entity.CartItems;
import com.foodorderingwebsite.Foodorderingwebsite.service.CartItemsService;
import com.foodorderingwebsite.Foodorderingwebsite.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    private CartItemsService cartItemsService;

   @Autowired
   private CartService cartService;
   @PostMapping("/cart/addItem")
    public CartItems addCartItems(@RequestParam Long itemsId, @RequestParam int cartItemQuantity,@RequestParam Long userId) {
        return cartService.addCartItems(itemsId, cartItemQuantity,userId);

    }
    @DeleteMapping("/cart/deleteCartItems/{id}")
    public String deleteCartItemsByCartItemsId(@PathVariable("id") Long cartItemsId  ){
       cartItemsService.deletecartItemsByCartItemsId(cartItemsId);
       return "Deleted CartItems Successfully!!";
    }


}