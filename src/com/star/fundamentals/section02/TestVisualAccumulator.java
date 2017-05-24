package com.star.fundamentals.section02;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestVisualAccumulator {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        VisualAccumulator visualAccumulator = new VisualAccumulator(n, 1.0);

        for (int i = 0; i < n; i++) {
            visualAccumulator.addDataValue(StdRandom.uniform());
        }

        StdOut.println(visualAccumulator);
    }
}
