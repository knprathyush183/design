package com.designpatterns.structural.bridge.shapeexample;

public class BridgePatternTest {
    public static void main(String[] args) {
        Shape redTriangle = new Triangle(new RedColor());
        redTriangle.applyColor();

        Shape greenPentagon = new Pentagon(new GreenColor());
        greenPentagon.applyColor();
    }
}
