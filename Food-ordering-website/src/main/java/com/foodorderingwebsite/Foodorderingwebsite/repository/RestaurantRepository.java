package com.foodorderingwebsite.Foodorderingwebsite.repository;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

    public  Restaurant findByRestaurantName(String restaurantName);

    public Restaurant findByRestaurantAddress(String restaurantAddress);

    public Restaurant findByRestaurantEmailAndRestaurantPassword(String restaurantEmail,String restaurantPassword);

}
