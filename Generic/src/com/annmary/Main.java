package com.annmary;

import java.util.ArrayList;

class Machine {
    public String toString() {
        return "I am a machine";
    }

    public void start(){
        System.out.println("Machine starts");
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "I am Camera";
    }

    public void snap(){
        System.out.println("Camera snaps");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList list = new ArrayList();
        list.add("female");
        list.add("male");

        System.out.println(list.get(0));

    //////// modern style using generic //////////

        ArrayList<String> strs = new ArrayList<String>();
        strs.add("red");
        strs.add("blue");

        System.out.println(strs.get(0));


        ArrayList<Machine> machines = new ArrayList<Machine>();
        machines.add(new Machine());
        machines.add(new Machine());
        showList(machines);

        ArrayList<Machine> cameras  = new ArrayList<Machine>();
        cameras.add(new Camera());
        cameras.add(new Camera());
        showList(cameras);

        ArrayList<Camera> cameras1  = new ArrayList<Camera>();
        cameras1.add(new Camera());
        cameras1.add(new Camera());
        showList1(cameras1);
        showList2(cameras1);

    }

    public static void showList(ArrayList<Machine> lists){
        for(Machine value: lists){
            System.out.println(value);
        }
    }

    // Apply wildcard to enable the function render any method
    public static void showList1(ArrayList<?> lists){
        for(Object value: lists){
            System.out.println(value);
        }
    }

    // Apply wildcard to extend A parent class
    public static void showList2(ArrayList<? extends Machine> lists){
        for(Machine value: lists){
            System.out.println(value);
            value.start();
        }
    }

    // Apply wildcard to call a child's class
    public static void showList3(ArrayList<? super Camera> lists){
        for(Object value: lists){
            System.out.println(value);
        }
    }
}
