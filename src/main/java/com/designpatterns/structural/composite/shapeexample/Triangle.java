package com.designpatterns.structural.composite.shapeexample;

//Leaf objects
public class Triangle implements Shape{

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing triangle with color :" + fillColor);
    }
}
