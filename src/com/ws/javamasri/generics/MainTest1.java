package com.ws.javamasri.generics;

public class MainTest1 {

    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setT("Passing a String");
        String r = genericClass.getT();
    }
}
