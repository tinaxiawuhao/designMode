package com.example.designmode.builderPattern.abstractRealize;

import com.example.designmode.builderPattern.abstractClass.ColdDrink;

public class Coke extends ColdDrink {
 
   @Override
   public float price() {
      return 30.0f;
   }
 
   @Override
   public String name() {
      return "Coke";
   }
}