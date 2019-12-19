package com.example.designmode.observerPattern.abstractClass;

import com.example.designmode.observerPattern.Subject;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}