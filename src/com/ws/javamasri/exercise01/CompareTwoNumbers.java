package com.ws.javamasri.exercise01;

import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("First is bigger than second");
        } else if (number1 < number2) {
            System.out.println("Second is bigger than first");
        } else {
            System.out.println("Both numbers are equal");
        }
    }

}
