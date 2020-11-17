package com.annmary;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person1 = new Person("Annmary Agunanna", 45);
        person1.getPerson();
        Person.description = "description";
        int retirementAge = person1.calculateRetireAge();
        System.out.println("You have "+retirementAge+" left to retire");

        Person.showInfo();

    }


}

class Person {
    //declaring a constant
    public final static int AGE_RANGE = 5;
    private String name;
    private int age;
    public static String description;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // return method
    int calculateRetireAge(){
        int years = 65 - this.age;
        return years;
    }

    public void  getPerson(){
        System.out.print("name: "+ this.name +"\n age: "+this.age);
    }

    public static  void showInfo(){
        System.out.println("description is "+ description);
    }
}
