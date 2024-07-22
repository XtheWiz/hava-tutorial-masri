package com.ws.javamasri.exercise01;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);

            number = number / 10;
        }

        System.out.println("The sum of digits is: " + sum);
    }
}
