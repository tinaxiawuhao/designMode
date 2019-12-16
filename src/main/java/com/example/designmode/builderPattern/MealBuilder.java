package com.example.designmode.builderPattern;

import com.example.designmode.builderPattern.abstractRealize.ChickenBurger;
import com.example.designmode.builderPattern.abstractRealize.Coke;
import com.example.designmode.builderPattern.abstractRealize.Pepsi;
import com.example.designmode.builderPattern.abstractRealize.VegBurger;

public class MealBuilder {
 
   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   
 
   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}