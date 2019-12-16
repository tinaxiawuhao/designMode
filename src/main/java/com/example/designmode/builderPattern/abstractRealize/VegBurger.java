package com.example.designmode.builderPattern.abstractRealize;

import com.example.designmode.builderPattern.abstractClass.Burger;

public class VegBurger extends Burger {
 
   @Override
   public float price() {
      return 25.0f;
   }
 
   @Override
   public String name() {
      return "Veg Burger";
   }
}