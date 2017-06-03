package com.star.fundamentals.section04;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class StopWatch {

    private final long start;

    public StopWatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();

        return (now - start) / 1000.0;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = StdRandom.uniform(-1000000, 1000000);
        }

        StopWatch timer = new StopWatch();

        int count = ThreeSum.count(array);
        double time = timer.elapsedTime();

        StdOut.println(count + " triples " + time + " seconds");
    }
}
