package com.designpatterns.structural.bridge.shapeexample;

public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
