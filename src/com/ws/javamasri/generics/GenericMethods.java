package com.ws.javamasri.generics;

public class GenericMethods {

    public static void main(String[] args) {
        Welcome("Master", 27);
        Welcome(12, false);
        Welcome(true, "Suddenly");

    }

    public static <T, S> void Welcome(T t, S s) {
        System.out.println("Welcome to " + t);
        System.out.println("Another object: " + s);
    }
}
