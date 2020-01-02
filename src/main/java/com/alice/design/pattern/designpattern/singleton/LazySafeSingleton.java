package com.alice.design.pattern.designpattern.singleton;

public class LazySafeSingleton {

    private static LazySafeSingleton instance = null;

    private LazySafeSingleton() {
    }

    public synchronized static LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
