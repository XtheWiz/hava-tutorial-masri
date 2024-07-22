package com.ws.javamasri.basicjava;

import java.util.Scanner;

public class AboutChar {

    public static void main(String[] args) {
        char j = 'j';
        System.out.println("Char 'j': " + j);

        char asciiChar = 65;
        System.out.println("Ascii 65 = " + asciiChar);

        char omegaChar = '\u03a9';
        System.out.println("Omega = " + omegaChar);

        System.out.println("Please enter a character: ");
        Scanner scanner = new Scanner(System.in);
        char myChar = scanner.next().charAt(0);
        System.out.println("Char: " + myChar);
        System.out.println("Char Ascii: " + (int) myChar);
    }
}
