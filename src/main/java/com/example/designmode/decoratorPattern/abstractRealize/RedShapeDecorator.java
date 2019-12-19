package com.example.designmode.decoratorPattern.abstractRealize;

import com.example.designmode.decoratorPattern.abstractClass.ShapeDecorator;
import com.example.designmode.decoratorPattern.face.Shape;

public class RedShapeDecorator extends ShapeDecorator {
 
   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);     
   }
 
   @Override
   public void draw() {
      decoratedShape.draw();         
      setRedBorder(decoratedShape);
   }
 
   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}