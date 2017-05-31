package com.star.fundamentals.section03;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] array = (Item[]) new Object[1];
    private int n = 0;

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];

        for (int i = 0; i < n; i++) {
            temp[i] = array[i];
        }

        array = temp;
    }

    public void push(Item item) {

        if (n == array.length) {
            resize(2 * array.length);
        }

        array[n++] = item;
    }

    public Item pop() {
        Item item = array[--n];

        array[n] = null;

        if (n > 0 && n == array.length / 4) {
            resize(array.length / 2);
        }

        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {

        private int i = n;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return array[--i];
        }
    }

    public static void main(String[] args) {
        ResizingArrayStack<String> resizingArrayStack =
                new ResizingArrayStack<>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!"-".equals(item)) {
                resizingArrayStack.push(item);
            } else if (!resizingArrayStack.isEmpty()) {
                StdOut.print(resizingArrayStack.pop() + " ");
            }
        }

        StdOut.println("(" + resizingArrayStack.size() + " left on stack)");
    }
}
