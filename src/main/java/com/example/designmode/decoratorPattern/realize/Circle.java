package com.example.designmode.decoratorPattern.realize;

import com.example.designmode.decoratorPattern.face.Shape;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}