package com.annmary;

public class Main {
    // You can change this to enum class
    public static final int DOG = 0;
    public static final int CAT = 1;
    public static final int MOUSE = 2;

    public static void main(String[] args) {
	// write your code here
        Animal animal = Animal.CAT;

        switch (animal){
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
            case MOUSE:
                System.out.println("mouse");
                break;
            default:
                System.out.println("Not found");
        }

        System.out.println(animal);
        System.out.println(animal.getName());
        System.out.println(Animal.valueOf("MOUSE"));

        System.out.println("The result is " + calculateFactorial(4));
    }

    // recursion
    private static int calculateFactorial(int value){
        if (value == 1){
            return 1;
        }

        return calculateFactorial(value- 1) * value;
    }
}
