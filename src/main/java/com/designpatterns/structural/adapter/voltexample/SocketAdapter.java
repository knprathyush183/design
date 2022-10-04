package com.designpatterns.structural.adapter.voltexample;

public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get30Volt();
}
