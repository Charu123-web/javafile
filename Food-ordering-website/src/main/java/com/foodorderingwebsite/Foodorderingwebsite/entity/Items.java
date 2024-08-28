package com.foodorderingwebsite.Foodorderingwebsite.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Lombok
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Items")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemsId;
    private String itemName;
    private int itemPrice;
    private String itemCategory;



    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "fk_restaurantId")

    private Restaurant restaurant;

  /*  @OneToOne
    private CartItems cartItems;  */



}
