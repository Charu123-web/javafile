package com.foodorderingwebsite.Foodorderingwebsite.controller;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Restaurant;
import com.foodorderingwebsite.Foodorderingwebsite.password.Utilss;
import com.foodorderingwebsite.Foodorderingwebsite.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {


   @Autowired
    private RestaurantService restaurantService;

   @PostMapping("/restaurant")
    public Restaurant saveRestaurant(@RequestBody Restaurant restaurant){

        return restaurantService.saveRestaurant(restaurant);
    }

    @GetMapping("/restaurant")
    public List<Restaurant> fetchRestaurantList(){

     return restaurantService.fetchRestaurantList();
    }

   @GetMapping("/restaurant/{id}")
    public Restaurant fetchRestaurantById(@PathVariable("id") Long restaurantId){
        return restaurantService.fetchRestaurantById(restaurantId);
    }

   @DeleteMapping("/restaurant/{id}")
    public String deleteRestaurantById(@PathVariable("id") Long restaurantId){
        restaurantService.deleteRestauranById(restaurantId);
        return "Restaurant deleted successfully!!";
   }

  @PutMapping("/restaurant/{id}")
   public Restaurant updateRestaurant(@PathVariable("id") Long restaurantId,@RequestBody Restaurant restaurant){
        return restaurantService.updateRestaurant(restaurantId,restaurant);
  }
    @GetMapping("/restaurant/name/{name}")
    public Restaurant fetchRestaurantByName(@PathVariable("name") String restaurantName){
        return restaurantService.fetchRestaurantByName(restaurantName);
    }
    @GetMapping("/restaurant/address/{address}")
    public Restaurant fetchRestaurantByAddress(@PathVariable("address") String restaurantAddress){
        return restaurantService.fetchRestaurantByAddress(restaurantAddress);
    }
    @GetMapping("/restaurant/login")
    public String loginRestOwner(@RequestParam String restaurantEmail,@RequestParam String restaurantPassword){
      return  restaurantService.loginRestOwner(restaurantEmail,restaurantPassword);
    }
}
