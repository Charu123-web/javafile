package com.foodorderingwebsite.Foodorderingwebsite.repository;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Cart;
import com.foodorderingwebsite.Foodorderingwebsite.entity.CartItems;
import com.foodorderingwebsite.Foodorderingwebsite.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    public Cart findByUser(User user);


}
