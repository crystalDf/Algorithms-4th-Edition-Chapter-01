package com.star.fundamentals.section03;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int n;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void enqueue(Item item) {

        Node oldLast = last;

        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }

        n++;
    }

    public Item dequeue() {

        Item item = first.item;

        first = first.next;

        if (isEmpty()) {
            last = null;
        }

        n--;

        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {

            Item item = current.item;
            current = current.next;

            return item;
        }
    }

    public static void main(String[] args) {
        Queue<String> queue =
                new Queue<>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!"-".equals(item)) {
                queue.enqueue(item);
            } else if (!queue.isEmpty()) {
                StdOut.print(queue.dequeue() + " ");
            }
        }

        StdOut.println("(" + queue.size() + " left on stack)");
    }
}
