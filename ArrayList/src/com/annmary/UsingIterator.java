package com.annmary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingIterator {

  public static void main(String[] args){
    List<String> animals = new ArrayList<String>();
    animals.add("goat");
    animals.add("elephant");
    animals.add("cat");
    animals.add("giraffe");

    Iterator<String> animals2 = animals.iterator();

    while (animals2.hasNext()){
      String value = animals2.next();
      System.out.println(value);

      if(value.equals("goat")){
        animals2.remove();
      }

    }

    System.out.println();

    // this is the modern way to iterate through array
    // you cannot remove items with the modern iteration unless you implement a collection
    for(String animal: animals){
      System.out.println("modern: "+animal);
    }
  }
}
