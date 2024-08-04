package com.ws.javamasri.recursive;

public class MainTest1 {
    public static void main(String[] args) {
        // Iteration: Using loop
        for (int i = 0; i < 10; i++) {
            System.out.println("iteration: " + i);
        }
        System.out.println("--------------------------------");


        // Recursive
        shout(10);
    }

    public static void shout(int n) {
        if (n <= 0) {
            System.out.println();
        } else {
            System.out.println("Hello: " + n);
            shout(n - 1);
        }
    }
}
