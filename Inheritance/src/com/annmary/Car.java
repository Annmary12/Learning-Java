package com.annmary;

public class Car extends Machine {
    // to override a method in machine

    @Override
    public void start() {
        System.out.println("Car started");
    }
}
