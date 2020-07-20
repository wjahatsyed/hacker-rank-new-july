package com.wajahat.hackerrank.ipk;

/**
 * Created by Syed Wajahat on 3/6/2020.
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] c = {0, 0, 0, 0, 1, 0};
        System.out.print(jumpingOnClouds(c));
    }

    static int jumpingOnClouds(int[] c) {
        int turns = 0;
        for (int i = 1; i < c.length; ) {
            if (c[i] == 0) {
                if (i + 1 < c.length && c[i + 1] == 0) {
                    turns++;
                    i += 2;
                } else {
                    turns++;
                    i++;
                }
            } else {
                if (i + 1 < c.length && c[i + 1] == 0) {
                    turns++;
                    i += 2;
                }
            }
        }
        return turns;
    }
}
