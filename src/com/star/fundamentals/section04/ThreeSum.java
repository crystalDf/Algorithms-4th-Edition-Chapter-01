package com.star.fundamentals.section04;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ThreeSum {

    public static void main(String[] args) {

        int[] array = new In(args[0]).readAllInts();

        StdOut.println(count(array));
    }

    public static int count(int[] array) {

        int n = array.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
