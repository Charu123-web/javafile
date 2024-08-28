package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Cart;
import com.foodorderingwebsite.Foodorderingwebsite.entity.CartItems;
import com.foodorderingwebsite.Foodorderingwebsite.entity.User;
import com.foodorderingwebsite.Foodorderingwebsite.repository.CartItemsRepository;
import com.foodorderingwebsite.Foodorderingwebsite.repository.CartRepository;
import com.foodorderingwebsite.Foodorderingwebsite.repository.ItemsRepository;
import com.foodorderingwebsite.Foodorderingwebsite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ItemsRepository itemsRepository;
    @Autowired
    private CartItemsRepository cartItemsRepository;

    @Override
    public CartItems addCartItems(Long itemsId, int cartItemQuantity, Long userId) {
        User user= userRepository.getByUserId(userId);
        Cart cart = cartRepository.findByUser(user);
         if(cart==null){
             cart= new Cart();

             cart.setUser(user);//in this step only userid is assigneds
             cart= cartRepository.save(cart);//in this cart id is also generated and return
         }
         CartItems cartItems = new CartItems();
         cartItems.setCartItemQuantity(cartItemQuantity);
         cartItems.setCart(cart);

        cartItems.setitemsId(itemsId);
         cartItems=cartItemsRepository.save(cartItems);
         return cartItems;
    }
}
