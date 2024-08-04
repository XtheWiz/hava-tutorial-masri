package com.ws.javamasri.morecollections;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        String[] data = {"to", "be", "or", "not", "to", "be"};
        Stack<String> stack = new Stack<>();

        for(String str: data) {
            stack.push(str);
        }

        System.out.println("Stack : " + stack);
        System.out.println("Size  : " + stack.size());

        // peek() - return the top of stack without removing it
        System.out.println("peek(): " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("pop stack ==> " + stack.pop());
        }
    }
}
