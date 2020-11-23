package com.annmary;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args){
        // you can also use LinkedSet and TreeSet depending on the order you want to achieve
        HashSet<String> set = new HashSet<String>();

        set.add("Amaka");
        set.add("Sylvia");
        set.add("Tusky");
        set.add("Raji");

        System.out.println(set);

        for(String val: set){
            System.out.println(val);
        }

        // to check if a set contains a value
        Boolean containsValue = set.contains("Ami");
        System.out.println("contain Ami: " + containsValue);

        // check if set is empty
        Boolean isEmpty = set.isEmpty();
        System.out.println("Check set is empty: " + isEmpty);

        HashSet<String> set2 = new HashSet<String>();

        set2.add("Amaka");
        set2.add("Sylvia");
        set2.add("Ihuoma");
        set2.add("Uzo");

        // check for interception(what the have in common
        Set<String> interception = new HashSet<String>(set);

        interception.retainAll(set2);
        System.out.println(interception + "intercept values");

        // check difference between the set
        Set<String> difference = new HashSet<String>(set);

        set2.removeAll(difference);
        System.out.println(set2 + "different values");

    }
}
