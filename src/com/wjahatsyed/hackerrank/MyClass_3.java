package com.wjahatsyed.hackerrank;

import java.util.Arrays;

/**
 * Created by Syed Wajahat on 7/21/2020.
 * Practice -> Algorithms -> Implementation -> Beautiful Triplets
 */
public class MyClass_3 {
     static int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (Arrays.stream(arr).anyMatch(s -> s == n + d) && Arrays.stream(arr).anyMatch(s -> s == (n + d + d))) {
                count += 1;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 10};
        System.out.println(beautifulTriplets(3, arr));
    }


}
