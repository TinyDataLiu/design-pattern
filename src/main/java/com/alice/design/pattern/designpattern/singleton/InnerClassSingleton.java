package com.alice.design.pattern.designpattern.singleton;

public class InnerClassSingleton {

    private InnerClassSingleton() {
    }


    public static final InnerClassSingleton getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }

}
