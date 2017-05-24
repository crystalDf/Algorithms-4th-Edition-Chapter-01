package com.star.fundamentals.section02;

import edu.princeton.cs.algs4.StdOut;

public class Date {

    private final int month;
    private final int day;
    private final int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }

        Date that = (Date) obj;

        if (this.month != that.month) {
            return false;
        }

        if (this.day != that.day) {
            return false;
        }

        if (this.year != that.year) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        Date date = new Date(month, day, year);

        StdOut.println(date);
    }
}
