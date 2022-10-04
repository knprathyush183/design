package com.designpatterns.structural.composite.shapeexample;

public class DrawingTest {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape cir = new Circle();
        Drawing drawing = new Drawing();
        drawing.addShape(tri);
        drawing.addShape(cir);

        drawing.draw("red");

        drawing.clear();
        drawing.addShape(tri);

        drawing.draw("green");
    }
}
