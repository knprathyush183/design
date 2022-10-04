package com.designpatterns.structural.decorator.carexample;

public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Basic car.");
    }
}
