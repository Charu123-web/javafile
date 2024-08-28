package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    public  Restaurant saveRestaurant(Restaurant restaurant);


  public  List<Restaurant> fetchRestaurantList();

   public Restaurant fetchRestaurantById(Long restaurantId);

   public void deleteRestauranById(Long restaurantId);

  public  Restaurant updateRestaurant(Long restaurantId, Restaurant restaurant);

  public  Restaurant fetchRestaurantByName(String restaurantName);

   public Restaurant fetchRestaurantByAddress(String restaurantAddress);

    String loginRestOwner(String restaurantEmail,String restaurantPassword);
}