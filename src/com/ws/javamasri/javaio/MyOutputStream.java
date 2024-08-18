package com.ws.javamasri.javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyOutputStream {
    public static void main(String[] args) throws IOException {
        String data = "Hello my friends, Please shut up!!!";
        OutputStream outputStream = new FileOutputStream("hello-myfriend.txt");

        // Convert string into bytes
        byte[] dataBytes = data.getBytes();
        outputStream.write(dataBytes);
        System.out.println("Data is written to the file");

        outputStream.close();
    }
}
