package com.designpatterns.structural.adapter.voltexample;

public class AdapterPatternTest {
    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v30 = getVolt(socketAdapter, 30);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("V30 volts using object adapter=" + v30.getVolts());
        System.out.println("V12 volts using object adapter=" + v12.getVolts());
        System.out.println("V120 volts using object adapter=" + v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v30 = getVolt(socketAdapter, 30);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("V30 volts using class adapter=" + v30.getVolts());
        System.out.println("V12 volts using class adapter=" + v12.getVolts());
        System.out.println("V120 volts using class adapter=" + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 30 : return socketAdapter.get30Volt();
            case 12 : return socketAdapter.get12Volt();
            case 120: return socketAdapter.get120Volt();
            default:return socketAdapter.get120Volt();
        }

    }
}
