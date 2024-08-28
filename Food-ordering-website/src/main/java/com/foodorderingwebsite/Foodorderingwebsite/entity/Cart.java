package com.foodorderingwebsite.Foodorderingwebsite.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name="cart")
@Lombok
@Builder

public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;

    @OneToMany(mappedBy = "cart")
    private Set<CartItems> cartItems ;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "fk_userId")
    private User user;


}
