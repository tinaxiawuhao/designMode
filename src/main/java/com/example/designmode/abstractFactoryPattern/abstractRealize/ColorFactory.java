package com.example.designmode.abstractFactoryPattern.abstractRealize;

import com.example.designmode.abstractFactoryPattern.AbstractFactory;
import com.example.designmode.abstractFactoryPattern.face.Color;
import com.example.designmode.abstractFactoryPattern.face.Shape;
import com.example.designmode.abstractFactoryPattern.realize.Blue;
import com.example.designmode.abstractFactoryPattern.realize.Green;
import com.example.designmode.abstractFactoryPattern.realize.Red;

public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      } else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
      } else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}