package com.example.designmode.prototypePattern.realize;

import com.example.designmode.prototypePattern.abstractClass.Shape;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}