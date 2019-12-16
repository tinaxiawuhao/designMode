package com.example.designmode.prototypePattern.realize;

import com.example.designmode.prototypePattern.abstractClass.Shape;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}