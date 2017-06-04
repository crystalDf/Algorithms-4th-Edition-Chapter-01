package com.star.fundamentals.section05;

import com.star.fundamentals.section04.StopWatch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class QuickUnion extends UnionFind {

    public QuickUnion(int n) {
        super(n);
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

            id[pRoot] = qRoot;

            setCount(getCount() - 1);
        }
    }

    public static void main(String[] args) {

        In in = new In(args[0]);

        int n = in.readInt();

        QuickUnion quickUnion = new QuickUnion(n);

        StopWatch timer = new StopWatch();

        testUnionFind(in, quickUnion);

        double time = timer.elapsedTime();

        StdOut.println(time + " seconds");
    }
}
