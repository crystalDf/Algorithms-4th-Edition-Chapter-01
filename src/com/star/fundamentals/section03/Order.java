package com.star.fundamentals.section03;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Order {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        while (!StdIn.isEmpty()) {
            queue.enqueue(StdIn.readInt());
        }

        int n = queue.size();

        for (int i = 0; i < n; i++) {
            StdOut.println(queue.dequeue());
        }
    }
}
