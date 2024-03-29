package com.example.designmode.observerPattern;

import com.example.designmode.observerPattern.abstractRealize.BinaryObserver;
import com.example.designmode.observerPattern.abstractRealize.HexaObserver;
import com.example.designmode.observerPattern.abstractRealize.OctalObserver;

public class ObserverPatternDemo {
   /**
    * 观察者模式
    * 优点： 1、观察者和被观察者是抽象耦合的。
    *       2、建立一套触发机制。
    * 缺点： 1、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
    *       2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
    *       3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
    * 使用场景：
    *       一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使它们可以各自独立地改变和复用。
    *       一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度。
    *       一个对象必须通知其他对象，而并不知道这些对象是谁。
    *       需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象……，可以使用观察者模式创建一种链式触发机制。
    * 注意事项： 1、JAVA 中已经有了对观察者模式的支持类。
    *          2、避免循环引用。
    *          3、如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
    * @param args
    */
   public static void main(String[] args) {
      Subject subject = new Subject();
 
      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);
 
      System.out.println("First state change: 15");   
      subject.setState(15);
      System.out.println("Second state change: 10");  
      subject.setState(10);
   }
}