package com.annmary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObject {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Writing objects");
        Person[] people = { new Person(1, "Shridhar"), new Person(2, "Annmary")};

        // writing an arrayList
        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        // writing an object with the size

        try(FileOutputStream fs = new FileOutputStream("people.bin")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(people);
            os.writeObject(peopleList);
            os.writeObject(peopleList.size());

            for(Person person: peopleList){
                os.writeObject(person);
                System.out.println(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
