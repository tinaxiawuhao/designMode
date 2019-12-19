package com.example.designmode.observerPattern.abstractRealize;

import com.example.designmode.observerPattern.Subject;
import com.example.designmode.observerPattern.abstractClass.Observer;

public class OctalObserver extends Observer {
 
   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
     System.out.println( "Octal String: " 
     + Integer.toOctalString( subject.getState() ) ); 
   }
}