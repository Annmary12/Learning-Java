package com.annmary;

public enum Animal {
    CAT("Fergus"), DOG("Hescut"), MOUSE("ratus");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
