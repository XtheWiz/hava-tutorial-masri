package com.ws.javamasri.basicjava;

public class AboutArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = new int[] {6,7,8,9,0};

        for(int num1 : nums1) {
            System.out.println("From`` nums1: " + num1);
        }

        for(int num2: nums2) {
            System.out.println("From nums2: " + num2);
        }
    }
}
