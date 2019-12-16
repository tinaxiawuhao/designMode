package com.example.designmode.builderPattern.abstractClass;

import com.example.designmode.builderPattern.face.Item;
import com.example.designmode.builderPattern.face.Packing;
import com.example.designmode.builderPattern.realize.Bottle;

public abstract class ColdDrink implements Item {
 
    @Override
    public Packing packing() {
       return new Bottle();
    }
 
    @Override
    public abstract float price();
}