package com.ws.javamasri.javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyObjectInputStream {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("emp1.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


            Employee employeeReceived = (Employee) objectInputStream.readObject();
            System.out.println(employeeReceived.name + " "  + employeeReceived.salary);

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
