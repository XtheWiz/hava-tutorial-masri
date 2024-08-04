package com.ws.javamasri.recursive;

public class FibonacciTest {

    public static void main(String[] args) {

        long fibo1 = fibonacci(15);
        System.out.println("Fibo: " + fibo1);

    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
