package com.example.designmode.observerPattern.abstractRealize;

import com.example.designmode.observerPattern.Subject;
import com.example.designmode.observerPattern.abstractClass.Observer;

public class HexaObserver extends Observer {
 
   public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
      System.out.println( "Hex String: " 
      + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}