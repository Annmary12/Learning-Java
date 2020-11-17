package com.annmary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Machine {
    public void start(){
        System.out.println("Machine is starting....");
    }
}

interface Plant {
    public void grow();
}
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

        Machine machine = new Machine(){
            @Override
            public void start() {
                System.out.println("Camera is starting...");
            }
        };

        machine.start();

        Plant plant = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant Growing...");
            }
        };
        plant.grow();

        // Reading a file from system
//        String filename = "/Users/annmaryagunanna/desktop/example.txt";

        // Reading file from the project
        String filename = "example.txt";
        File textFile = new File(filename);
        Scanner input = new Scanner(textFile);
        int counter = 0;

        int value = input.nextInt();
        System.out.println("Read value: "+value);

        input.nextLine();

        while (input.hasNextLine()){
            System.out.println(counter+ ": " +input.nextLine());
            counter++;
        }
    }
}
