package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
   public  User saveUser(User user);

   public List<User> fetchUserList();

   public Optional<User> fetchUserById(Long userId);

  public void deleteUserById(Long userId);

  public   User updateUser(Long userId, User user);

  public   User fetchUserByName(String userName);

  public   User fetchUserByAddress(String userAddress);

   public String loginUser(String userEmail, String userPassword);
}
