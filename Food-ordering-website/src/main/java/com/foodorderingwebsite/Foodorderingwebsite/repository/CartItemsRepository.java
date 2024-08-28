package com.foodorderingwebsite.Foodorderingwebsite.repository;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Cart;
import com.foodorderingwebsite.Foodorderingwebsite.entity.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemsRepository extends JpaRepository<CartItems,Long> {




 public void deleteCartItemsByCart(Cart cart);

public List<CartItems> findCartItemsByCart(Cart cart);
}
