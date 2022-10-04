package com.designpatterns.structural.adapter.voltexample;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

    // Uses Java inheritance
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return new Volt(getVolt().getVolts()/10);
    }

    @Override
    public Volt get30Volt() {
        return new Volt(getVolt().getVolts()/4);
    }
}
