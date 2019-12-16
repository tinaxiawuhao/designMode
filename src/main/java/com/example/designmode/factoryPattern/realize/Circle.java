package com.example.designmode.factoryPattern.realize;

import com.example.designmode.factoryPattern.face.Shape;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}