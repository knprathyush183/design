package com.designpatterns.structural.adapter.voltexample;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
