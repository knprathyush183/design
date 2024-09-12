package com.designpatterns.creational.abstractfactory.computerexample;

import com.designpatterns.creational.factory.computerexample.Computer;
import com.designpatterns.creational.factory.computerexample.PC;

public class PCFactory implements ComputerAbstractFactory{

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
