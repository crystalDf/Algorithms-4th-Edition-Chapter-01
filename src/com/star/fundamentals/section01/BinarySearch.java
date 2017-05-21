package com.star.fundamentals.section01;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

import java.util.Arrays;

public class BinarySearch {

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

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < whitelist[middle]) {
                high = middle - 1;
            } else if (key > whitelist[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

}
