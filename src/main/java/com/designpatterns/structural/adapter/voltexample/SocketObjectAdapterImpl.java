package com.designpatterns.structural.adapter.voltexample;

public class SocketObjectAdapterImpl implements SocketAdapter{

    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return new Volt(socket.getVolt().getVolts()/10);
    }

    @Override
    public Volt get30Volt() {
        return new Volt(socket.getVolt().getVolts()/4);
    }
}
