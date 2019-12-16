package com.example.designmode.factoryPattern.realize;

import com.example.designmode.factoryPattern.face.Shape;

public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}