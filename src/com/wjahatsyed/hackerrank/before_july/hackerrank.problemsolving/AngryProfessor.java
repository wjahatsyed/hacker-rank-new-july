package com.company;

/**
 * Created by Syed Wajahat on 8/9/2019.
 */
public class AngryProfessor {
    public static void main(String[] args) {
        int k = 3;
        int[] a = {-1, -3, 4, 2};
        System.out.println(angryProfessor(k, a));
    }

    static String angryProfessor(int k, int[] a) {
        String message = "";
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                count++;
            }
        }

        if (count >= k) {
            message = "NO";
        } else {
            message = "YES";
        }
        return message;

    }
}
