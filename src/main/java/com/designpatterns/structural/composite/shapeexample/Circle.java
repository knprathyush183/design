package com.designpatterns.structural.composite.shapeexample;

//Leaf objects
public class Circle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drwaing cirlce with color :" + fillColor);
    }
}
