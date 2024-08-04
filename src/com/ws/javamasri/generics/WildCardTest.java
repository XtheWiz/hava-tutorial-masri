package com.ws.javamasri.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(10);
        integers.add(15);
        integers.add(20);
        PrintElements(integers);

//        List<Number> integers2 = new ArrayList<>(integers);
//        PrintElements2(integers2);
    }

    public static void PrintElements(List<? extends Number> numbers) {
        for (Number number: numbers) {
            System.out.println(number);
        }
    }

//    public static void PrintElements2(List<? super Integer> numbers) {
//        for (Number number: numbers) {
//            System.out.println(number);
//        }
//    }
}
