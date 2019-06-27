package com.app.SingleTonPattern;

public class SingleTonPattern {
    public static void main(String[] args) {
        SingleInstance instance = SingleInstance.getInstance();
        instance.showMessage();
    }
}
