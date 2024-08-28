package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Restaurant;
import com.foodorderingwebsite.Foodorderingwebsite.entity.User;
import com.foodorderingwebsite.Foodorderingwebsite.password.Utilss;
import com.foodorderingwebsite.Foodorderingwebsite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        user.setPassword(Utilss.PasswordGenerator());
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchUserList() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> fetchUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void deleteUserById(Long userId) {
         userRepository.deleteById(userId);
    }

    @Override
    public User updateUser(Long userId, User user) {
        User u1 = userRepository.findById(userId).get();
        if(Objects.nonNull(user.getUserName())&&
                !"".equalsIgnoreCase(user.getUserName())){
            u1.setUserName(user.getUserName());
        }
        u1.setUserPhoneNumber(user.getUserPhoneNumber());

        if(Objects.nonNull(user.getUserAddress())&&
                !"".equalsIgnoreCase(user.getUserAddress())){
            u1.setUserAddress(user.getUserAddress());
        }
        if(Objects.nonNull(user.getUserEmail())&&
                !"".equalsIgnoreCase(user.getUserEmail())){
            u1.setUserEmail(user.getUserEmail());
        }
        return userRepository.save(u1);


    }

    @Override
    public User fetchUserByName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public User fetchUserByAddress(String userAddress) {
        return  userRepository.findByUserAddress(userAddress);
    }

    @Override
    public String loginUser(String userEmail, String userPassword) {
        User u1= userRepository.findByUserEmailAndUserPassword(userEmail, userPassword);

        if(u1!=null) {
            return "Login successful!!";
        }
        else{
            return "Username or password is incorrect!!";
        }
    }
}
