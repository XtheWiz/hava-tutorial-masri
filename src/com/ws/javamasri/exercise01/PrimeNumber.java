package com.ws.javamasri.exercise01;

import java.util.Scanner;

public class PrimeNumber {

    private static final int NUMS_PER_ROW = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give the positive number to list all prime number before it: ");
        int number = scanner.nextInt();
        int numRowCount = 0;

        for (int i = 1; i < number; i++) {
            int counter = 0;

            for (int n = i; n > 0; n--) {
                if (i % n == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                System.out.print(i + " ");
                numRowCount++;

                if (numRowCount == NUMS_PER_ROW) {
                    System.out.println();
                    numRowCount = 0;
                }
            }
        }

    }
}
