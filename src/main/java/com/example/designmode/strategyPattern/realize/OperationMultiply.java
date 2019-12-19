package com.example.designmode.strategyPattern.realize;

import com.example.designmode.strategyPattern.face.Strategy;

public class OperationMultiply implements Strategy {
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }
}