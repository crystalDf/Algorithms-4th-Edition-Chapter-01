package com.star.fundamentals.section02;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestAccumulator {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        Accumulator accumulator = new Accumulator();

        for (int i = 0; i < n; i++) {
            accumulator.addDataValue(StdRandom.uniform());
        }

        StdOut.println(accumulator);
    }
}
