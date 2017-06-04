package com.star.fundamentals.section04;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class TwoSumFast {

    public static void main(String[] args) {

        int[] array = new In(args[0]).readAllInts();

        StdOut.println(count(array));
    }

    public static int count(int[] array) {

        Arrays.sort(array);

        int n = array.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (BinarySearch.indexOf(array, - array[i]) > i) {
                count++;
            }
        }

        return count;
    }
}
