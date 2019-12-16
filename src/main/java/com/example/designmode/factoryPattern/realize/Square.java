package com.example.designmode.factoryPattern.realize;

import com.example.designmode.factoryPattern.face.Shape;

public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}