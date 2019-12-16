package com.example.designmode.builderPattern.abstractClass;

import com.example.designmode.builderPattern.face.Item;
import com.example.designmode.builderPattern.face.Packing;
import com.example.designmode.builderPattern.realize.Wrapper;

public abstract class Burger implements Item {
 
   @Override
   public Packing packing() {
      return new Wrapper();
   }
 
   @Override
   public abstract float price();
}