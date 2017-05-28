package com.star.fundamentals.section03;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

    private Node first;
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

    public void push(Item item) {

        Node oldFirst = first;

        first = new Node();
        first.item = item;
        first.next = oldFirst;

        n++;
    }

    public Item pop() {

        Item item = first.item;

        first = first.next;

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

        @Override
        public void remove() {

        }
    }
}
