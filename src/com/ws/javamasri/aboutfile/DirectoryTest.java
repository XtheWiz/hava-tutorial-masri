package com.ws.javamasri.aboutfile;

import java.io.File;
import java.io.IOException;

public class DirectoryTest {

    public static void main(String[] args) throws IOException {
        File dir1 = new File("mastercoding");
        dir1.mkdir();

        System.out.println("Created at(Abs): " + dir1.getAbsolutePath());
        if (dir1.isDirectory()) {
            System.out.println("Name: " + dir1.getName());

            String[] files = dir1.list();
            for (String file: files) {
                System.out.println("File name: " + file);
            }
        }
    }
}
