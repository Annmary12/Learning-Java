package com.annmary;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Person person1 = new Person(1, "bob");
        Person person2 = new Person(1, "amaka");
//        System.out.println(person1.equals(person2));

        double doubleValue1 = 12.7;
        double doubleValue2 = 12.7;
        // Objects.equals(doubleValue1, doubleValue2)
        System.out.println(doubleValue1 == doubleValue2);

        int intValue1 = 12;
        int intValue2 = 16;
        // intValue1 == intValue2
        System.out.println(Objects.equals(intValue1, intValue2));

        String str1 = "Hallo";
        String str2 = "Hallo";
        // str1 == str2
        System.out.println(str1.equals(str2));




    }
}

class Person {
    public String name;
    public Integer id;

    public Person(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}