package com.ws.javamasri.arrrraylist;

import java.util.ArrayList;

public class CompareTest {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(20);
        nums.add(10);
        nums.add(50);
        System.out.println(nums);

        // Comparable
        System.out.println(nums.get(0).compareTo(1));
    }
}
