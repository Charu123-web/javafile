package com.foodorderingwebsite.Foodorderingwebsite.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="cartItems")
@Lombok
@Builder
public class CartItems {


    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartItemsId;
    private int cartItemQuantity;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "fk_cartId")
    private Cart cart;


    //@JsonBackReference
    //@OneToOne
    //@JoinColumn(name = "fk_itemsId")
    private Long itemsId;

    public void setitemsId(Long itemsId) {
        this.itemsId=itemsId;
    }
}
