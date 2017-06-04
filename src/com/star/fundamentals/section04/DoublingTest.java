package com.star.fundamentals.section04;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class DoublingTest {

    private static final int MAX = 1000000;

    public static double timeTrial(int n) {

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = StdRandom.uniform(-MAX, MAX);
        }

        StopWatch timer = new StopWatch();
        int count = ThreeSumFast.count(array);

        return timer.elapsedTime();
    }

    public static void main(String[] args) {

        for (int n = 250; true; n += n) {
            double time = timeTrial(n);

            StdOut.printf("%7d %5.1f\n", n, time);
        }
    }
}
