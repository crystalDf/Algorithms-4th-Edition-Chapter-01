package com.star.fundamentals.section03;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stats {

    public static void main(String[] args) {

        Bag<Double> numbers = new Bag<>();

        while (!StdIn.isEmpty()) {
            numbers.add(StdIn.readDouble());
        }

        int n = numbers.size();

        double sum = 0.0;

        for (double x : numbers) {
            sum += x;
        }

        double mean = sum / n;

        sum = 0.0;

        for (double x : numbers) {
            sum += Math.pow(x - mean, 2);
        }

        double std = Math.sqrt(sum / (n - 1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);
    }
}
