package com.annmary;

// converting to abstract class means you cannot instanciate this class
public abstract class Machine {
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // you can implement instance with abstract class
    public abstract void start();
}
