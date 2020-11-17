package com.annmary;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Camera camera = new Camera();
        camera.setId(7);
        System.out.println(camera.getId());
        camera.start();

        Car car = new Car();
        car.setId(4);
        car.start();

        // You cannot instantiate Machine because it is an abstract class unless you add an anonymous function
        Machine machine = new Machine(){
            @Override
            public int getId() {
                return 5;
            }

            @Override
            public void start() {
                System.out.println("Machine starting ....");
            }

            ;
        };

        System.out.println(machine.getId());
        machine.start();

        creatingAndWritingFile();
        readingFile();
    }

    public static void readingFile() {
        File file = new File("test.txt");
        try(BufferedReader buffer = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.toString());;
        } catch (IOException e) {
            System.out.println("Cannot read the file " + file.toString());
        }
    }

    public  static  void creatingAndWritingFile() {
        File file = new File("test.txt");
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(file))) {
            buffer.write("Fifth Line\n");
//            buffer.newLine();
            buffer.write("Sixth Line");

        } catch (IOException e) {
            System.out.println("Cannot read the file " + file.toString());
        }
    }
}
