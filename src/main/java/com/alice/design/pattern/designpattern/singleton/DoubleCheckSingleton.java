package com.alice.design.pattern.designpattern.singleton;

public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
