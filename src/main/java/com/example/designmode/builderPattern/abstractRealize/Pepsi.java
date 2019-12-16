package com.example.designmode.builderPattern.abstractRealize;

import com.example.designmode.builderPattern.abstractClass.ColdDrink;

public class Pepsi extends ColdDrink {
 
   @Override
   public float price() {
      return 35.0f;
   }
 
   @Override
   public String name() {
      return "Pepsi";
   }
}