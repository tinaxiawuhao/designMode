package com.example.designmode.decoratorPattern.realize;

import com.example.designmode.decoratorPattern.face.Shape;

public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }
}