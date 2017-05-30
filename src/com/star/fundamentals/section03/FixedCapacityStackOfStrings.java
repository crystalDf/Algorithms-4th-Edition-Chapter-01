package com.star.fundamentals.section03;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfStrings {

    private String[] array;
    private int n;

    public FixedCapacityStackOfStrings(int capacity) {
        array = new String[capacity];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void push(String item) {
        array[n++] = item;
    }

    public String pop() {
        return array[--n];
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings =
                new FixedCapacityStackOfStrings(100);

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!"-".equals(item)) {
                fixedCapacityStackOfStrings.push(item);
            } else if (!fixedCapacityStackOfStrings.isEmpty()) {
                StdOut.print(fixedCapacityStackOfStrings.pop() + " ");
            }
        }

        StdOut.println("(" + fixedCapacityStackOfStrings.size() + " left on stack)");
    }
}
