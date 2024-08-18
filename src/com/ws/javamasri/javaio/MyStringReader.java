package com.ws.javamasri.javaio;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class MyStringReader {

    public static void main(String[] args) {
        String source = "hello my lovely language.. Java ?";

        try {
            Reader reader = new StringReader(source);
            char[] readData = new char[100];

            reader.read(readData);
            System.out.println("The read data: ");
            System.out.println(readData);
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
