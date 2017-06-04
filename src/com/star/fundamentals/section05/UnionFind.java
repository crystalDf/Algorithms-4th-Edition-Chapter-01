package com.star.fundamentals.section05;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public abstract class UnionFind {

    private int count;
    private int[] id;

    public UnionFind(int n) {

        count = n;
        id = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getId() {
        return id;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public abstract int find(int p);

    public abstract void union(int p, int q);

    public static void testUnionFind(In in, UnionFind unionFind) {

        while (!in.isEmpty()) {

            int p = in.readInt();
            int q = in.readInt();

            if (!unionFind.connected(p, q)) {
                unionFind.union(p, q);
//                StdOut.println(p + " " + q);
            }
        }

        StdOut.println(unionFind.getCount() + " components");
    }
}
