package com.foodorderingwebsite.Foodorderingwebsite.controller;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Items;
import com.foodorderingwebsite.Foodorderingwebsite.entity.Restaurant;
import com.foodorderingwebsite.Foodorderingwebsite.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemsController {
  @Autowired
  private ItemsService itemsService;


    @PostMapping("/items")
    public Items saveItems(@RequestBody Items items){

        return itemsService.saveItems(items);
    }
  @GetMapping("/items")
  public List<Items> fetchItemList(){

    return itemsService.fetchItemsList();
  }
  @GetMapping("/items/name/{name}")
  public Items fetchItemByName(@PathVariable("name") String itemName){
    return itemsService.fetchItemByName(itemName);
  }
  @PutMapping("/items/id/{id}")
  public Items updateItems(@PathVariable("id") Long itemsId,@RequestBody Items items){
    return itemsService.updateItems(itemsId,items);
  }
  @DeleteMapping("/items/id/{id}")
  public String deleteItemById(@PathVariable("id") Long itemsId){
    itemsService.deleteItemByItemsId(itemsId);
    return "Items deleted successfully!!";
  }
}
