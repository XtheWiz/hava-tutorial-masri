package com.ws.javamasri.aboutfile;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("hello.txt");

        try {
            if (f1.createNewFile()) {
                System.out.println("File created: " + f1.getAbsolutePath());
            } else {
                System.out.println("File already existed");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        System.out.println("Name: " + f1.getName());
//        System.out.println("Path: " + f1.getPath());
//        System.out.println("Parent: " + f1.getParent());
//        System.out.println("isExisted: " + f1.exists());
//        System.out.println("isDirectory: " + f1.isDirectory());
//        System.out.println("isFile: " + f1.isFile());
//        System.out.println("size: " + f1.length());
    }
}
