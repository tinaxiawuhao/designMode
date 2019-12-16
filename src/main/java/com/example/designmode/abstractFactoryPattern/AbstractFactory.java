package com.example.designmode.abstractFactoryPattern;

import com.example.designmode.abstractFactoryPattern.face.Color;
import com.example.designmode.abstractFactoryPattern.face.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}