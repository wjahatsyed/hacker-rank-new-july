package com.company;

/**
 * Created by Syed Wajahat on 8/1/2019.
 */
public class Main6 {
    public static void main(String[] args) {
        //System.out.println(pageCount(5, 4));
        System.out.println(pageCount(6, 5));
    }

    static int pageCount(int n, int p) {
        //p = page number and n = number of pages
        int turnPagesLeft = 0;
        int turnPagesRight = 0;
        if (p == n || p == 1) {
            return 0;
        } else {
            //if turning page to left side
            int j = 1;
            for (int i = 1; i <= p; ) {
                turnPagesLeft++;
                i = j + 1;
                j = i + 1;
                if (i == p || p == j) {
                    break;
                }


            }

            //if turning page to right side
            //if odd
            if (n % 2 == 0) {
                int jk = 0;
                for (int i = n; i >= 2; ) {

                    if (p == i || p == jk) {
                        break;
                    }
                    jk = i - 1;
                    i = jk - 1;
                    turnPagesRight++;
                }
            } else {
                while (n - 1 > p) {
                    n = n - 2;
                    turnPagesRight++;
                }


            }
        }

        if (turnPagesLeft < turnPagesRight) {
            return turnPagesLeft;

        }

        return turnPagesRight;


    }

}
