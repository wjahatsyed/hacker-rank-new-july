package com.company;

import java.util.Arrays;

/**
 * Created by Syed Wajahat on 8/9/2019.
 */
public class HurdleRace {
    public static void main(String[] args) {
        int[] height = {2, 5, 4, 5, 2};
        int k = 7;
        System.out.println(hurdleRace(k, height));
    }

    static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        int j = height[height.length - 1];
        if (k < j) {
            return Math.abs(j - k);
        }

        return 0;

    }
}
