package com.company;

/**
 * Created by Syed Wajahat on 8/10/2019.
 */
public class CircularArrayRotation {
    public static void main(String[] args) {
        int[] a = {3, 4, 5};
        int k = 2;
        int[] queries = {1, 2};

        circularArrayRotation(a, k, queries);
    }

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] newArray = new int[queries.length];
        while (k > 0) {
            int[] temp = new int[a.length];
            temp[0] = a[a.length - 1];
            for (int i = 1; i < a.length; i++) {
                temp[i] = a[i - 1];
            }

            a = temp;
            k--;
        }

        for (int i = 0; i < queries.length; i++) {
            newArray[i] = a[queries[i]];
        }
        return newArray;

    }

}
