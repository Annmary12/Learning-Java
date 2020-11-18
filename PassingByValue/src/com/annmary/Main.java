package com.annmary;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        int score = 7;
        System.out.println("1: score is -"+ score);
        main.show(score);

        // score value will not change because it is passed by value
        System.out.println("4: score is -"+ score);

        // =======================================================
        // using an object
        // In java, objects are passed by value not reference
        Person person = new Person("Annmary");

        System.out.println("1: Name is "+ person.getName());

        main.show(person);

        System.out.println("4: Name is "+ person.getName());

    }

    public void show(int value){
        System.out.println("2: score is -"+ value);

        value = 8;
        System.out.println("3: score is -"+ value);
    }

    // this is called method overloading. Having the same method name with different argument
    public void show(Person person){
        System.out.println("2: Name is "+ person.getName());
        // it will change output 4
        person.setName("Raji");

        // ideally, you will be accepting the person object in 4 to change because in other programming language
        // objects passes value by reference but in java, it is by value
        // Here, it creates a new object.
        person = new Person("Tusky");

        System.out.println("3: Name is "+ person.getName());
    }
}
