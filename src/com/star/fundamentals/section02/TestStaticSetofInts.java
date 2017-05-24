package com.star.fundamentals.section02;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

public class TestStaticSetofInts {

    public static void main(String[] args) {

        int[] whitelist = new In(args[0]).readAllInts();
        int[] target = new In(args[1]).readAllInts();

        Out out = new Out(args[2]);

        StaticSetofInts staticSetofInts = new StaticSetofInts(whitelist);

        for (int key : target) {

            if (!staticSetofInts.contains(key)) {
                out.println(key);
            }
        }

    }
}
