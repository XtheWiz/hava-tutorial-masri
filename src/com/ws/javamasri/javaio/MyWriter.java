package com.ws.javamasri.javaio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyWriter {

    public static void main(String[] args) {
        try {
            String myString = "I would like to be a Millionaire";
            Writer writer = new FileWriter("hello-filewriter.txt");

            writer.write(myString);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
