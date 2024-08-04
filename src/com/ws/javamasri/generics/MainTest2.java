package com.ws.javamasri.generics;

public class MainTest2 implements GenericInterface<Integer> {
    @Override
    public void PrintMessage(Integer integer) {
        System.out.println("Printing: " + integer);
    }
}
