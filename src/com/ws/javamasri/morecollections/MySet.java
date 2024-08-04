package com.ws.javamasri.morecollections;

import com.sun.source.tree.Tree;

import java.util.*;

public class MySet {

    public static void main(String[] args) {

        // Hashset: uses a hash table for storage that places element into specific position
        //          based upon integers called hashed code.
        Set<String> s1 = new HashSet<>();
        s1.add("element_1");
        s1.add("element_2");
        s1.add("element_2");
        s1.add("element_3");
        System.out.println(s1);

        Iterator<String> iterator1 = s1.iterator();
        while (iterator1.hasNext()) {
            System.out.println("=== s1 ===> " + iterator1.next());
        }
        System.out.println("-----------------------------------");

        // LinkedHashSet: Ordered set
        Set<String> s2 = new LinkedHashSet<>();
        s2.add("A");
        s2.add("B");
        s2.add("C");
        s2.add("C");
        s2.add("E");
        s2.add("D");

        Iterator<String> iterator2 = s2.iterator();
        while (iterator2.hasNext()) {
            System.out.println("=== s2 ===> " + iterator2.next());
        }
        System.out.println("-----------------------------------");

        // TreeSet: Element of set is in ascending order.
        Set<String> s3 = new TreeSet<>();
        s3.add("Z");
        s3.add("A");
        s3.add("X");
        s3.add("D");
        s3.add("Y");
        s3.add("O");

        Iterator<String> iterator3 = s3.iterator();
        while (iterator3.hasNext()) {
            System.out.println("=== s3 ===> " + iterator3.next());
        }
    }
}
