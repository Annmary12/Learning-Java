package com.annmary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Reading an object");

       try( FileInputStream fi = new FileInputStream("people.bin")) {
           ObjectInputStream oi = new ObjectInputStream(fi);

           Person person1 = (Person) oi.readObject();
           Person person2 = (Person) oi.readObject();

           System.out.println(person1);
           System.out.println(person2);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
    }
}
