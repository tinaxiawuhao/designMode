package com.example.designmode.decoratorPattern;

import com.example.designmode.decoratorPattern.abstractClass.ShapeDecorator;
import com.example.designmode.decoratorPattern.abstractRealize.RedShapeDecorator;
import com.example.designmode.decoratorPattern.face.Shape;
import com.example.designmode.decoratorPattern.realize.Circle;
import com.example.designmode.decoratorPattern.realize.Rectangle;

public class DecoratorPatternDemo {
   /**
    * 装饰器模式
    * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
    * 缺点：多层装饰比较复杂。
    * 使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
    * 注意事项：可代替继承。
    * @param args
    */
   public static void main(String[] args) {
 
      Shape circle = new Circle();
      ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
      ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
      //Shape redCircle = new RedShapeDecorator(new Circle());
      //Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();
 
      System.out.println("Circle of red border");
      redCircle.draw();
 
      System.out.println("Rectangle of red border");
      redRectangle.draw();
   }
}