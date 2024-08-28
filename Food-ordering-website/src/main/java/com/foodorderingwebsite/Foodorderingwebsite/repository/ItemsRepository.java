package com.foodorderingwebsite.Foodorderingwebsite.repository;

import com.foodorderingwebsite.Foodorderingwebsite.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ItemsRepository extends JpaRepository<Items,String> {




  public   Items findByItemsId(Long itemsId);

  public  Items findByItemName(String itemName);
}