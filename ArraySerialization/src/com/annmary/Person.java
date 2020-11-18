package com.annmary;

import java.io.Serializable;

public class Person implements Serializable {
    // adding transient means you cannot serialize the variable
    private transient int id;
    private String name;

    // you cannot serialise static variables
    public static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("Two-argument constructor");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "Count"+ count +'}';
    }
}

