package com.designpatterns.behavirol.state.tvremoteexample;

public class TVStopState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned off");
    }
}
