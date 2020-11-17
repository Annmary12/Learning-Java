package com.annmary;

import ocean.Fish;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Machine mach1 = new Machine();
        mach1.start();
        mach1.start();

        // car inherits the machine method
        Car car = new Car();
        car.start();
        car.stop();

        // packages
        Fish fish = new Fish();

        System.out.println(fish.toString());
    }
}
