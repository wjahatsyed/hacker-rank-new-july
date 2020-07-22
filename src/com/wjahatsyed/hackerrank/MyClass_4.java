package com.wjahatsyed.hackerrank;

/**
 * Created by Syed Wajahat on 7/22/2020.
 * Practice -> Algorithms -> Implementation -> Jumping on the Clouds: Revisited
 */
public class MyClass_4 {
    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        boolean keepMoving = true;
        int index = 0;
        int iValue = 0;
        while (keepMoving) {
            index = (index + k) % c.length;
            iValue = c[index];
            if (iValue == 1) {
                e -= 3;
            } else {
                e -= 1;
            }
            if (index == 0) {
                keepMoving = false;
            }
        }
        return e;
    }

    public static void main(String[] args) {
        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        System.out.println(jumpingOnClouds(c, 3));
    }
}
