package com.wajahat.hackerrank.ipk;

/**
 * Created by Syed Wajahat on 3/6/2020.
 */
public class ArrayLeftRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        rotLeft(a, 4);
    }

    static int[] rotLeft(int[] a, int d) {
        while (d > 0) {
            for (int i = 0; i < a.length - 1; i++) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
            d--;
        }
        return a;
    }
}
