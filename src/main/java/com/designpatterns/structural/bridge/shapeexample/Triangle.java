package com.designpatterns.structural.bridge.shapeexample;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle");
        color.applyColor();
    }
}
