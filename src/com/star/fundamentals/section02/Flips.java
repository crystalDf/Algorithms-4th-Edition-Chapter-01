package com.star.fundamentals.section02;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Flips {

    public static void main(String[] args) {

        int total = Integer.parseInt(args[0]);

        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        for (int i = 0; i < total; i++) {
            if (StdRandom.bernoulli(0.5)) {
                heads.increment();
            } else {
                tails.increment();
            }
        }

        StdOut.println(heads);
        StdOut.println(tails);

        int delta = heads.tally() - tails.tally();

        StdOut.println("delta: " + Math.abs(delta));

        if (heads.tally() == tails.tally()) {
            StdOut.println("Tie");
        } else {
            StdOut.println(max(heads, tails) + " wins");
        }
    }

    public static Counter max(Counter x, Counter y) {
        if (x.tally() > y.tally()) {
            return x;
        } else {
            return y;
        }
    }
}
