package com.foodorderingwebsite.Foodorderingwebsite.password;

import java.util.Arrays;
import java.util.Random;
public class Utilss {
    public static String PasswordGenerator () {

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChars = "<>,.?/}]{[+_-)(*&^%$#@!=";
        String combination = upper + lower + specialChars + num;
        int len = 8;
        char[] pwd = new char[len];
        Random r = new Random();
        http:
//localhost:8082/restaurant/
        for (int i = 0; i < len; i++) {
            pwd[i] = combination.charAt(r.nextInt(combination.length()));
        }
        String ps=String.valueOf(pwd);
        System.out.println(ps);
        return ps;

    }

}