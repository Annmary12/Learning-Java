package com.annmary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Writing objects");

        Person shridhar = new Person(1, "Shridhar");
        Person amaka = new Person(2, "Annmary");

        System.out.println(shridhar);
        System.out.println(amaka);

        try(FileOutputStream fs = new FileOutputStream("people.bin")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(shridhar);
            os.writeObject(amaka);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
