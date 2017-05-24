package com.star.fundamentals.section02;

public class Accumulator {

    private double total;
    private int n;

    public void addDataValue(double value) {
        n++;
        total += value;
    }

    public double mean() {
        return total / n;
    }

    @Override
    public String toString() {
        return "Mean (" + n + " values): " + String.format("%7.5f", mean());
    }
}
