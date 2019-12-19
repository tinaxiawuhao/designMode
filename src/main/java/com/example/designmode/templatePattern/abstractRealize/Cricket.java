package com.example.designmode.templatePattern.abstractRealize;

import com.example.designmode.templatePattern.abstractClass.Game;

public class Cricket extends Game{
 
   @Override
   protected void endPlay() {
      System.out.println("Cricket Game Finished!");
   }
 
   @Override
   protected void initialize() {
      System.out.println("Cricket Game Initialized! Start playing.");
   }
 
   @Override
   protected void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
   }
}