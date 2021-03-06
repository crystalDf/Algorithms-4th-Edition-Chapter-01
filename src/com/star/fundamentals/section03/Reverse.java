package com.star.fundamentals.section03;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Reverse {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readInt());
        }

        for (int i : stack) {
            StdOut.println(i);
        }

        int n = stack.size();

        for (int i = 0; i < n; i++) {
            StdOut.println(stack.pop());
        }
    }
}
