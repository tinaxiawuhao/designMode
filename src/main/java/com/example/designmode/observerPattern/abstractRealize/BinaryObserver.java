package com.example.designmode.observerPattern.abstractRealize;

import com.example.designmode.observerPattern.Subject;
import com.example.designmode.observerPattern.abstractClass.Observer;

public class BinaryObserver extends Observer {
 
   public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
      System.out.println( "Binary String: " 
      + Integer.toBinaryString( subject.getState() ) ); 
   }
}