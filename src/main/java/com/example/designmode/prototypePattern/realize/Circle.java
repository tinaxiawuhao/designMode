package com.example.designmode.prototypePattern.realize;

import com.example.designmode.prototypePattern.abstractClass.Shape;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}