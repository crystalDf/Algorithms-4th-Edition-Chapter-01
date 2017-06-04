package com.star.fundamentals.section05;

import com.star.fundamentals.section04.StopWatch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class WeightedQuickUnion extends UnionFind {

    private int[] size;

    public WeightedQuickUnion(int n) {
        super(n);

        size = new int[n];

        for (int i = 0; i < n; i++) {
            size[i] = 1;
        }
    }

    @Override
    public int find(int p) {

        int[] id = getId();

        while (p != id[p]) {
            p = id[p];
        }

        return p;
    }

    @Override
    public void union(int p, int q) {

        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot != qRoot) {

            int[] id = getId();

            if (size[pRoot] < size[qRoot]) {
                id[pRoot] = qRoot;
                size[qRoot] += size[pRoot];
            } else {
                id[qRoot] = pRoot;
                size[pRoot] += size[qRoot];
            }

            setCount(getCount() - 1);
        }
    }

    public static void main(String[] args) {

        In in = new In(args[0]);

        int n = in.readInt();

        WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(n);

        StopWatch timer = new StopWatch();

        testUnionFind(in, weightedQuickUnion);

        double time = timer.elapsedTime();

        StdOut.println(time + " seconds");
    }
}
