package com.annmary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Reading an object");

        try( FileInputStream fi = new FileInputStream("people.bin")) {
            ObjectInputStream oi = new ObjectInputStream(fi);

            Person[] people = (Person[]) oi.readObject();

            // reading an array list
            ArrayList<Person> peopleList = (ArrayList<Person>) oi.readObject();

            for(Person person: people){
                System.out.println(person);
            }

            for(Person person: peopleList){
                System.out.println(person);
            }

            // reading with the size of the object
            int num = (int) oi.readObject();
            System.out.println(num);

            for(int i=0; i<num; i++){
                Person person = (Person) oi.readObject();
                System.out.println(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
