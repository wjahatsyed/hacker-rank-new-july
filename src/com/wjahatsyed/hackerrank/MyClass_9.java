package com.wjahatsyed.hackerrank;

/**
 * Created by Syed Wajahat on 7/26/2020.
 * Passed 8 of 10 test cases 'isPossible Hackerrank Java Test Question - Sr. Software engineer'
 */
public class MyClass_9 {
    public static String isPossible(int a, int b, int c, int d) {
        int tempa = a, tempb = b, tempc = c, tempd = d;
        String string = "No";
        boolean bc = true;

        while (bc) {
            if (a + b <= c) {
                if (a + b <= d) {
                    b = a + b;
                }
                a = a + b;
            } else {
                bc = false;
            }
        }

        if (a == c && b == d) {
            string = "Yes";
        } else {
            a = tempa;
            b = tempb;
            c = tempc;
            d = tempd;
            bc = true;
            while (bc) {
                if (a + b <= d) {
                    if (a + b <= c) {
                        a = a + b;
                    }
                    b = a + b;
                } else {
                    bc = false;
                }
            }
            if (a == c && b == d) {
                string = "Yes";
            }
        }

        return string;

    }

    public static void main(String[] args) {
        System.out.println(isPossible(1, 4, 62, 45));
    }
}
