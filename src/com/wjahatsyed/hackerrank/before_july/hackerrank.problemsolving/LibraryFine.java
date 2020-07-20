package com.company;

/**
 * Created by Syed Wajahat on 8/12/2019.
 */
public class LibraryFine {
    public static void main(String[] args) {
        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));
    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        //1 return dates
        //2 due dates
        int fine = 0;
        if (y1 > y2) {
            fine = 10000;
        } else if (y1 == y2) {
            if (m1 > m2) {
                int diff = Math.abs(m1 - m2);
                fine = 500 * diff;

            } else if (m1 == m2) {
                if (d1 > d2) {
                    int diff = Math.abs(d1 - d2);
                    fine = 15 * diff;
                }

            }
        }

        return fine;
    }
}
