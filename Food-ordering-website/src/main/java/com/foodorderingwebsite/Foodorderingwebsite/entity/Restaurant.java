package com.foodorderingwebsite.Foodorderingwebsite.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="restaurant")
@Lombok
@Builder

public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long restaurantId;
    @OneToMany(mappedBy = "restaurant")
    private Set<Items> items ;
    private String restaurantName;
    private Long restaurantNumber;
    private String restaurantAddress;
    private String restaurantEmail;
    private String restaurantPassword;


   /* public Restaurant(Long restaurantId) {
        this.restaurantId = restaurantId;
    }*/


    public void setPassword(String s) {

    }

  /*  public Restaurant() {
    }*/
}



