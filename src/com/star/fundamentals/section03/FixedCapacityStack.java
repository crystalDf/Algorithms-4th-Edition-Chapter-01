package com.star.fundamentals.section03;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStack<Item> {

    private Item[] array;
    private int n;

    public FixedCapacityStack(int capacity) {
        array = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        array[n++] = item;
    }

    public Item pop() {
        return array[--n];
    }

    public static void main(String[] args) {
        FixedCapacityStack fixedCapacityStack =
                new FixedCapacityStack(100);

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!"-".equals(item)) {
                fixedCapacityStack.push(item);
            } else if (!fixedCapacityStack.isEmpty()) {
                StdOut.print(fixedCapacityStack.pop() + " ");
            }
        }

        StdOut.println("(" + fixedCapacityStack.size() + " left on stack)");
    }
}
