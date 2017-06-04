package com.star.fundamentals.section04;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ThreeSumFast {

    public static void main(String[] args) {

        int[] array = new In(args[0]).readAllInts();

        StdOut.println(count(array));
    }

    public static int count(int[] array) {

        Arrays.sort(array);

        int n = array.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (BinarySearch.indexOf(array, - array[i] - array[j]) > j) {
                    count++;
                }
            }
        }

        return count;
    }
}
