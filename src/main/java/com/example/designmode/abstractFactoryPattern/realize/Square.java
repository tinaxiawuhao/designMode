package com.example.designmode.abstractFactoryPattern.realize;

import com.example.designmode.abstractFactoryPattern.face.Shape;

public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}