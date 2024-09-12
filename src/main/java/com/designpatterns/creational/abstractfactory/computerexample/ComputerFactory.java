package com.designpatterns.creational.abstractfactory.computerexample;

import com.designpatterns.creational.factory.computerexample.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
