package com.star.fundamentals.section02;

import java.util.Arrays;

public class StaticSetofInts {

    private int[] whitelist;

    public StaticSetofInts(int[] whitelist) {

        this.whitelist = new int[whitelist.length];

        for (int i = 0; i < whitelist.length; i++) {
            this.whitelist[i] = whitelist[i];
        }

        Arrays.sort(this.whitelist);
    }

    public boolean contains(int key) {
        return rank(key) != -1;
    }

    private int rank(int key) {

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
