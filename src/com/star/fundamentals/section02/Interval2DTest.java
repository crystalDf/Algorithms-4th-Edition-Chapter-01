package com.star.fundamentals.section02;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

public class Interval2DTest {

    public static void main(String[] args) {

        double xLow = Double.parseDouble(args[0]);
        double xHigh = Double.parseDouble(args[1]);
        double yLow = Double.parseDouble(args[2]);
        double yHigh = Double.parseDouble(args[3]);

        int total = Integer.parseInt(args[4]);

        Interval1D xInterval = new Interval1D(xLow, xHigh);
        Interval1D yInterval = new Interval1D(yLow, yHigh);
        Interval2D box = new Interval2D(xInterval, yInterval);

        box.draw();

        Counter hits = new Counter("hits");

        for (int i = 0; i < total; i++) {
            double x = Math.random();
            double y = Math.random();

            Point2D point = new Point2D(x, y);

            if (box.contains(point)) {
                hits.increment();
            } else {
                point.draw();
            }
        }

        StdOut.println(hits);
        StdOut.println(box.area());

    }
}
