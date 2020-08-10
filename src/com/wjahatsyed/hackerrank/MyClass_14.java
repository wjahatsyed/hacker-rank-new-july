package com.wjahatsyed.hackerrank;

/**
 * Created by Syed Wajahat on 8/10/2020.
 * Algorithm -> Implementation -> Strange counter
 */
public class MyClass_14 {
    public static void main(String[] args) {
        System.out.println(strangeCounter(1000));
    }

    static long strangeCounter(long t) {
        long n = 2;
        while (3 * (n - 1) < t) n = 2 * n;
        return ((3 * (n - 1) - t + 1));
    }
}
