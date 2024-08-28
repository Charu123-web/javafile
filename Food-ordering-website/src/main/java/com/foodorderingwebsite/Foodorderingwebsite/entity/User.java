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
@Table(name="user")
@Lombok
@Builder
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long userId;
        private String userName;
        private int userPhoneNumber;
        private String userEmail;
        private String userAddress;

        private String userPassword;


        @OneToOne

        private Cart cart;


        public void setPassword(String s) {

        }


}
