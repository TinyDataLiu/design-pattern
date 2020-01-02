package com.alice.design.pattern.designpattern.singleton;

/**
 * 饿汉式
 */
public class HungarySingleton {

    private final static HungarySingleton instance = new HungarySingleton();

    private HungarySingleton(){}

    public static HungarySingleton getInstance(){
        return instance;
    }
}
