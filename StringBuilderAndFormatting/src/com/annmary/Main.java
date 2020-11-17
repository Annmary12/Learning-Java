package com.annmary;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // inefficient because it creates a new string each time
        // Generally, strings are immutable in java
        String info = "";
        info += "I am Annmary";
        info += " ";
        info += "I work at Berlin";

        System.out.println(info);

        // Efficient because it appends the string
        StringBuilder str = new StringBuilder("");
        str.append("I am Ann").append(" ").append("I am from Nigeria");

        System.out.println(str.toString());

        // String Formatting with %d
        System.out.printf("I am %d years old", 29);
        // to give a space before printing
        System.out.printf("\nMy average height is %-3.2f\n", 22.567);

        Frog frog = new Frog("Ann", 5);
        System.out.println(frog);


    }
}

class Frog {
    String name;
    int id;

    public Frog(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ").append(id);
        return sb.toString();
//        return String.format("%4d: %s", this.name, this.id).toString();
    }
}
