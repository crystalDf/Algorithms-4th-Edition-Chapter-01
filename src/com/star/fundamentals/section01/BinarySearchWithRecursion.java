package com.star.fundamentals.section01;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

import java.util.Arrays;

public class BinarySearchWithRecursion {

    public static void main(String[] args) {

        int[] whitelist = new In(args[0]).readAllInts();
        int[] target = new In(args[1]).readAllInts();

        Out out = new Out(args[2]);

        Arrays.sort(whitelist);

        for (int key : target) {

            if (rank(key, whitelist) == -1) {
                out.println(key);
            }
        }
    }

    private static int rank(int key, int[] whitelist) {

        int low = 0;
        int high = whitelist.length - 1;

        return rank(key, whitelist, low, high);
    }

    private static int rank(int key, int[] whitelist, int low, int high) {

        if (low > high) {
            return -1;
        }

        int middle = low + (high - low) / 2;

        if (key < whitelist[middle]) {
            return rank(key, whitelist, low, middle - 1);
        } else if (key > whitelist[middle]) {
            return rank(key, whitelist, middle + 1, high);
        } else {
            return middle;
        }
    }

}
