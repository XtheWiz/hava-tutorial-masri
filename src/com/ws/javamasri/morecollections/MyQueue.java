package com.ws.javamasri.morecollections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) {
        String[] data = {"to" ,"be", "or", "not", "to", "be"};

        Queue<String> queue = new LinkedList<>(Arrays.asList(data));

        System.out.println("Queue   : " + queue);
        System.out.println("Size    : " + queue.size());
        System.out.println("Peek    : " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("=== remove ===> " + queue.remove());
        }
    }
}
