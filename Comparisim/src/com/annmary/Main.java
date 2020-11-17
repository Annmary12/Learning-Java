package com.annmary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Fizzbuzz Exercise
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if  (number % 5 == 0 && number % 3 == 0)
            System.out.println("Fizz Buzz");
        else if (number % 3 == 0)
           System.out.println("Buzz");
        else if (number % 5 == 0)
           System.out.println("Fizz");
        else
           System.out.println(number);

    }
}
