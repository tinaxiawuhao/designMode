package com.example.designmode.decoratorPattern.abstractClass;

import com.example.designmode.decoratorPattern.face.Shape;

public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;
 
   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }
 
   public void draw(){
      decoratedShape.draw();
   }  
}