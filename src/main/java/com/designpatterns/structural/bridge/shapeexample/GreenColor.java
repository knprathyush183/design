package com.designpatterns.structural.bridge.shapeexample;

public class GreenColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
