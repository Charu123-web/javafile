package com.foodorderingwebsite.Foodorderingwebsite.controller;

import com.foodorderingwebsite.Foodorderingwebsite.entity.User;
import com.foodorderingwebsite.Foodorderingwebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

   @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
     return userService.saveUser(user);

    }

    @GetMapping("/user")
    public List<User> fetchUserList(){

        return userService.fetchUserList();
    }
    @GetMapping("/user/{id}")
    public Optional<User> fetchUserById(@PathVariable("id") Long userId){
        return userService.fetchUserById(userId);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") Long userId){
        userService.deleteUserById(userId);
        return "User deleted successfully!!";
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable("id") Long userId,@RequestBody User user){
        return userService.updateUser(userId,user);
    }
    @GetMapping("/user/name/{name}")
    public User fetchUserByName(@PathVariable("name") String userName){
        return userService.fetchUserByName(userName);
    }
    @GetMapping("/user/address/{address}")
    public User fetchRestaurantByUser(@PathVariable("address") String userAddress){
        return userService.fetchUserByAddress(userAddress);
    }
    @GetMapping("/user/login")
    public String loginUser(@RequestParam String userEmail,@RequestParam String userPassword){
        return userService.loginUser(userEmail,userPassword);
    }
}
