package com.alice.design.pattern.designpattern.singleton;

/**
 * 懒汉式
 */
public class LazySingleton {

    private LazySingleton(){}
    private  static LazySingleton instance = null;

    public static LazySingleton getInstance(){
        if(null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }
}
