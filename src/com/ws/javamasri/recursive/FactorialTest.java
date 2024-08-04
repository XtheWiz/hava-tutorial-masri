package com.ws.javamasri.recursive;

public class FactorialTest {

    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(6));
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
