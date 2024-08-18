package com.ws.javamasri.javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyObjectOutputStream {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Jack", 12000);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("emp1.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(emp1);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
