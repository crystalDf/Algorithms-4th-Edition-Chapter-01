package com.star.fundamentals.section05;

import com.star.fundamentals.section04.StopWatch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class QuickFind extends UnionFind {

    public QuickFind(int n) {
        super(n);
    }

    @Override
    public int find(int p) {

        int[] id = getId();

        return id[p];
    }

    @Override
    public void union(int p, int q) {

        int pId = find(p);
        int qId = find(q);

        if (pId != qId) {

            int[] id = getId();

            for (int i = 0; i < id.length; i++) {
                if (id[i] == pId) {
                    id[i] = qId;
                }
            }

            setCount(getCount() - 1);
        }
    }

    public static void main(String[] args) {

        In in = new In(args[0]);

        int n = in.readInt();

        QuickFind quickFind = new QuickFind(n);

        StopWatch timer = new StopWatch();

        testUnionFind(in, quickFind);

        double time = timer.elapsedTime();

        StdOut.println(time + " seconds");
    }
}
