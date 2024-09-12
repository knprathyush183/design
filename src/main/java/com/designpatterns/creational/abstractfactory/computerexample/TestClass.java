package com.designpatterns.creational.abstractfactory.computerexample;

import com.designpatterns.creational.factory.computerexample.Computer;

public class TestClass {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "500GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("8GB", "1TB", "2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
