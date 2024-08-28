package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Items;
import com.foodorderingwebsite.Foodorderingwebsite.entity.Restaurant;

import java.util.List;

public interface ItemsService {
  public Items saveItems(Items items);

 public List<Items> fetchItemsList();



  public  Items fetchItemByName(String itemName);




    Items updateItems(Long itemsId, Items items);

    public  void deleteItemByItemsId(Long itemsId);
}
