package com.company;

/**
 * Created by Syed Wajahat on 8/10/2019.
 */
public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(0));
        System.out.println(utopianTree(1));
        System.out.println(utopianTree(4));


    }

    static int utopianTree(int n) {
        int height = 1;
        int count = 1;
        while (n > 0) {

            if (count == 1) {
                height *= 2;
            } else {
                if (count % 2 == 0) {
                    height++;
                } else {
                    height *= 2;
                }
            }
            count++;
            n--;
        }
        return height;

    }
}

