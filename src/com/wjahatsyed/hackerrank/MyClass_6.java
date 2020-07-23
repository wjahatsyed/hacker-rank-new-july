package com.wjahatsyed.hackerrank;

/**
 * Created by Syed Wajahat on 7/23/2020
 * Practice -> Algorithms -> Implementation -> Chocolate Feast
 * n: an integer representing Bobby's initial amount of money
 * c: an integer representing the cost of a chocolate bar
 * m: an integer representing the number of wrappers he can turn in for a free bar
 */
public class MyClass_6 {
    static int chocolateFeast(int n, int c, int m) {
        int initChoc = 0;
        int freeChoc = 0;
        while (n > 0 && n >= c) {
            n -= c;
            initChoc++;
        }
        int wrappers = initChoc;
        while (wrappers > 0 && wrappers >= m) {
            wrappers -= m;
            freeChoc++;
            wrappers++;
        }
        initChoc += freeChoc;
        return initChoc;

    }

    public static void main(String[] args) {

        System.out.println(chocolateFeast(7, 3, 2));
    }
}
