package com.example.designmode.builderPattern.abstractRealize;

import com.example.designmode.builderPattern.abstractClass.Burger;

public class ChickenBurger extends Burger {
 
   @Override
   public float price() {
      return 50.5f;
   }
 
   @Override
   public String name() {
      return "Chicken Burger";
   }
}