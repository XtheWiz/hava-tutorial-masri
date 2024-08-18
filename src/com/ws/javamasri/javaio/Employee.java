package com.ws.javamasri.javaio;

import java.io.Serializable;

public class Employee implements Serializable {

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
