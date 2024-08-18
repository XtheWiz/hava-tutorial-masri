package com.ws.javamasri.javaio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyReader {

    public static void main(String[] args) {
        char[] array = new char[100];
        try {
            Reader reader = new FileReader("hello.txt");
            System.out.println("Ready? " + reader.ready());

            reader.read(array);
            System.out.println("Data in the stream: ");
            System.out.println(array);

            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
