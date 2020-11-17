package com.annmary;

public class Machine implements IStartable {
    public void start(){
        System.out.println("Machine started.");
    }

    public void stop(){
        System.out.println("Machine stopped");
    }
}
