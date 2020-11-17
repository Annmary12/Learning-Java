package com.annmary;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final  byte PERCENT = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = input.nextFloat();
        float montlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = input.nextByte();
        int numberOfPayment = years * MONTHS_IN_YEAR;

        double mortgage = principal * (montlyInterest
                * Math.pow(1 + montlyInterest, numberOfPayment)
                / ( Math.pow(1 + montlyInterest, numberOfPayment) - 1));
        System.out.println("Hello I am here");

        String mortageFormat = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortageFormat);

    }
}
