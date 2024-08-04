package com.ws.javamasri.recursive;

public class MainTest2 {
    public static void main(String[] args) {
        System.out.println("Result: " + CalculatePower(5,3));
    }

    // Integer Exponential
    public static int CalculatePower(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * CalculatePower(x, y - 1);
        }
    }
}
