package com.foodorderingwebsite.Foodorderingwebsite.service;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Items;
import com.foodorderingwebsite.Foodorderingwebsite.repository.ItemsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ItemsServiceImpl implements ItemsService{
 @Autowired
  private ItemsRepository itemsRepository;

 public Items saveItems(Items items){
     return itemsRepository.save(items);
 }

    @Override
    public List<Items> fetchItemsList() {
        return itemsRepository.findAll();
    }



    @Override
    public Items fetchItemByName(String itemName) {
        return itemsRepository.findByItemName(itemName);
    }



    @Override
    public Items updateItems(Long itemsId, Items items) {
        Items i1 = itemsRepository.findByItemsId(itemsId);
        if(Objects.nonNull(items.getItemName())&&
                !"".equalsIgnoreCase(items.getItemName())){
            i1.setItemName(items.getItemName());
        }
        if(Objects.nonNull(items.getItemCategory())&&
                !"".equalsIgnoreCase(items.getItemCategory())){
            i1.setItemCategory(items.getItemCategory());
        }
        if(Objects.nonNull(items.getItemPrice())&&
                !"".equalsIgnoreCase(String.valueOf((items.getItemPrice())))) {
            i1.setItemPrice(items.getItemPrice());
        }


        return itemsRepository.save(i1);




    }

    @Override
    public void deleteItemByItemsId(Long itemsId) {

    }


  /*  @Transactional
   @Override
    public void deleteItemByItemsId(Long itemsId) {
        itemsRepository.deleteById(String.valueOf(itemsId));
    }*/






}
