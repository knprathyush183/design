package com.designpatterns.structural.bridge.shapeexample;

public class Pentagon extends Shape{

    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagon");
        color.applyColor();
    }
}
