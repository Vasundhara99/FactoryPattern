package com.app.SingleTonPattern;

public class SingleInstance {
    private static SingleInstance instance = new SingleInstance();
    private SingleInstance(){}
    public static SingleInstance getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
