package com.ws.javamasri.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyInputStream {

    // Character stream => for character or string
    // Byte stream => Working with bytes or binary object

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("hello.txt");

        int data = inputStream.read();
        while(data != -1) {
            System.out.println((char) data);
            data = inputStream.read();
        }

        inputStream.close();
    }




}
