package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Restaurant;
import com.foodorderingwebsite.Foodorderingwebsite.password.Utilss;
import com.foodorderingwebsite.Foodorderingwebsite.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public  Restaurant saveRestaurant(Restaurant restaurant) {
        restaurant.setPassword(Utilss.PasswordGenerator());
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> fetchRestaurantList() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant fetchRestaurantById(Long restaurantId) {
        return restaurantRepository.findById( restaurantId).get();
    }

    @Override
    public void deleteRestauranById(Long restaurantId) {
         restaurantRepository.deleteById(restaurantId);
    }

    @Override
    public Restaurant updateRestaurant(Long restaurantId, Restaurant restaurant) {
        Restaurant res = restaurantRepository.findById(restaurantId).get();
        if(Objects.nonNull(restaurant.getRestaurantName())&&
        !"".equalsIgnoreCase(restaurant.getRestaurantName())){
            res.setRestaurantName(restaurant.getRestaurantName());
        }
        if(Objects.nonNull(restaurant.getRestaurantNumber())&&
                !"".equalsIgnoreCase(String.valueOf(restaurant.getRestaurantNumber()))){
            res.setRestaurantNumber(restaurant.getRestaurantNumber());
        }
        if(Objects.nonNull(restaurant.getRestaurantAddress())&&
                !"".equalsIgnoreCase(restaurant.getRestaurantAddress())){
            res.setRestaurantAddress(restaurant.getRestaurantAddress());
        }
        if(Objects.nonNull(restaurant.getRestaurantEmail())&&
                !"".equalsIgnoreCase(restaurant.getRestaurantEmail())){
            res.setRestaurantEmail(restaurant.getRestaurantEmail());
        }
        return restaurantRepository.save(res);
    }

    @Override
    public Restaurant fetchRestaurantByName(String restaurantName) {
        return restaurantRepository.findByRestaurantName(restaurantName);
    }

    @Override
    public Restaurant fetchRestaurantByAddress(String restaurantAddress) {
        return restaurantRepository.findByRestaurantAddress(restaurantAddress);
    }

    @Override
    public String loginRestOwner(String restaurantEmail,String restaurantPassword) {
       Restaurant res= restaurantRepository.findByRestaurantEmailAndRestaurantPassword(restaurantEmail, restaurantPassword);

        if(res!=null) {
            return "Login successful!!";
        }
        else{
            return "Username or password is incorrect!!";
        }
    }
}

