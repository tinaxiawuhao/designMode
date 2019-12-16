package com.example.designmode.abstractFactoryPattern.realize;

import com.example.designmode.abstractFactoryPattern.face.Color;

public class Blue implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}