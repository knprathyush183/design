package com.designpatterns.structural.composite.shapeexample;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
    private List<Shape> shapes = new ArrayList<>();
    @Override
    public void draw(String fillColor) {
        shapes.forEach(shape -> shape.draw(fillColor));
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void deleteShape(Shape shape) {
        shapes.remove(shape);
    }

    public void clear() {
        System.out.println("Clearing all shapes from drawing");
        shapes.clear();
    }
}
