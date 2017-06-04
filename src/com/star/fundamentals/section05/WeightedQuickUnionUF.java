package com.star.fundamentals.section05;

import com.star.fundamentals.section04.StopWatch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class WeightedQuickUnionUF {

    private int count;
    private int[] parent;
    private int[] size;

    public WeightedQuickUnionUF(int n) {

        count = n;
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {

        while (p != parent[p]) {
            p = parent[p];
        }

        return p;
    }

    public void union(int p, int q) {

        int rootP = find(p);
        int rootQ = find(q);

        if (rootP != rootQ) {

            if (size[rootP] < size[rootQ]) {
                parent[rootP] = rootQ;
                size[rootQ] += size[rootP];
            } else {
                parent[rootQ] = rootP;
                size[rootP] += size[rootQ];
            }

            count--;
        }
    }

    public static void main(String[] args) {

        In in = new In(args[0]);

        int n = in.readInt();

        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(n);

        StopWatch timer = new StopWatch();

        while (!in.isEmpty()) {

            int p = in.readInt();
            int q = in.readInt();

            if (!weightedQuickUnionUF.connected(p, q)) {
                weightedQuickUnionUF.union(p, q);
//                StdOut.println(p + " " + q);
            }
        }

        StdOut.println(weightedQuickUnionUF.getCount() + " components");

        double time = timer.elapsedTime();

        StdOut.println(time + " seconds");
    }
}
