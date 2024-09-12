package com.designpatterns.creational.factory.computerexample;

public class TestClass {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "8GB", "500GB", "2.4GHz");
        Computer server = ComputerFactory.getComputer("server", "16GB", "1TB", "2.9GHz");
        System.out.println("Factory PC Config: " + pc);
        System.out.println("Factory server Config: " + server);
    }
}
