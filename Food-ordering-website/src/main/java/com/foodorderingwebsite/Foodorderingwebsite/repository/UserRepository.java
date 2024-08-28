package com.foodorderingwebsite.Foodorderingwebsite.repository;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Restaurant;
import com.foodorderingwebsite.Foodorderingwebsite.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>  {
  public   User findByUserName(String userName);

  public   User findByUserAddress(String userAddress);

  public   User findByUserEmailAndUserPassword(String userEmail, String userPassword);

   public User getByUserId(Long userId);
}
