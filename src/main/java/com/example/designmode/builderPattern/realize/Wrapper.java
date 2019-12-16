package com.example.designmode.builderPattern.realize;

import com.example.designmode.builderPattern.face.Packing;

public class Wrapper implements Packing {
 
   @Override
   public String pack() {
      return "Wrapper";
   }
}