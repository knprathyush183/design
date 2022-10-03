package com.designpatterns.behavirol.state.tvremoteexample;

public class TVStartState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
