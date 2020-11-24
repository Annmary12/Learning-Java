package com.annmary;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

class sortByLength implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) return 1;
        else if (len1 < len2) return -1;
        return 0;
    }
}

class  sortByAlphabet implements  Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}

class Person {
  private Integer id;
  private String name;

  public Person(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
   return id + ": " + name;
  }
}

public class SortingArray<pp, p1> {
    public static void main(String[] args){
        List<String> animals = new ArrayList<String>();

        animals.add("goat");
        animals.add("elephant");
        animals.add("cat");
        animals.add("giraffe");

        // sorts by length
        Collections.sort(animals, new sortByLength());

        for(String animal: animals){
            System.out.println(animal);
        }

        System.out.println("\n");
        /* sorts by alphabet */
        Collections.sort(animals, new sortByAlphabet());

        for(String animal: animals){
            System.out.println(animal);
        }

        System.out.println("\n");
        // sorting numbers
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(8);
        numbers.add(15);
        numbers.add(2);
        numbers.add(0);

        Collections.sort(numbers);

        for(Integer num: numbers){
            System.out.println(num);
        }

      System.out.println("\n");
        // sorts by descending order
        Collections.sort(numbers,
                new Comparator<Integer>(){
                    public int compare(Integer num1, Integer num2){
                        return -num1.compareTo(num2);
                    };
                });
      for(Integer num: numbers){
        System.out.println(num);
      }

      System.out.println("\n");

      // sorting an object
      List<Person> people = new ArrayList<Person>();
      people.add(new Person(5, "Ihuoma"));
      people.add(new Person(1, "Ann"));
      people.add(new Person(9, "Dinma"));
      people.add(new Person(19, "Raji"));

      Collections.sort(people, new Comparator<Person>() {
        @Override
        public int compare(Person person1, Person person2) {
          // you can sort by the person's Id
          return person1.getName().compareTo(person2.getName());
        }
      });

      for(Person person: people){
        System.out.println(person);
      }


    }
}
