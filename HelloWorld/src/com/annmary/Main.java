package com.annmary;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int amount;
        double balance;
        //Insert amount and balance from console
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the amount: ");
        amount = input.nextInt();
        System.out.println("Enter the Total Balance: ");
        balance = input.nextDouble();
        //reduce amount+fee from balance
        balance=balance-(amount + 0.50);
        //print new balance
        System.out.print("Left Balance is: "+balance);
        input.close();

	// write your code here
        // Primitive types
        byte age = 30;
        long viewCounts = 3_123_345_234l;
//        char name = A;
        boolean isAFemale = true;

        // reference types
        Date now = new Date();

        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.y = 4;

        String name = "Amaka" + "!!";

        /// Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        System.out.println(Arrays.toString(numbers));

        // you can create this way too
        int[] numbers2 = {1, 2, 3, 4, 5};

        // two-dimensional array

        int[][] twoDimen = new int[2][3];
        twoDimen[0][1] = 1;

        int[][] twoDimen2 ={{1,2},{1,2,4}};
        System.out.println(Arrays.deepToString(twoDimen2));
        System.out.println(name.length());

        // number formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(1.22234));

        // reading inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
//        byte yourAge = scanner.nextByte();
        String yourName = scanner.nextLine();
        System.out.println("Your name is " + yourName);

    }
}
