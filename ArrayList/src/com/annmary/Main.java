package com.annmary;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // adding to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Iterating # 1");

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        // removing a value
        numbers.remove(numbers.size() - 1);

        // this is slow
        numbers.remove(0);
        
        System.out.println("Iterating # 2");
        for (Integer number: numbers){
            System.out.println(number);
        }
    }
}
