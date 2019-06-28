package com.app.SingleTonPattern;

public class SingleInstance {
    private static SingleInstance instance = new SingleInstance();
    protected SingleInstance(){}
    public static SingleInstance getInstance(){
        return instance;
    }
    protected void showMessage(){
        System.out.println("Hello World!");
    }
}
