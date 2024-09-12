package com.designpatterns.creational.singleton;

public class EagerInitializedSingleton {

    // instance is created even though client application might not be using it

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
