package com.wjahatsyed.hackerrank;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Syed Wajahat on 8/10/2020.
 * Algorithms -> Implementation -> Kaprekar numbers
 */
public class MyClass_13 {
    static void kaprekarNumbers(int p, int q) {
        try {
            Set<Long> mySet = new TreeSet<>();
            Set<Long> myKaprekar = new TreeSet<>();
            for (long i = p; i <= q; i++) {
                mySet.add(i);
            }

            for (long j : mySet) {
                Long k = j * j;
                String s = k.toString();
                if (s.length() > 1) {
                    if (s.length() == 2) {
                        long ss = Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(1));
                        if (ss == j) {
                            myKaprekar.add(ss);
                        }
                    } else {
                        //when length of square is greater than 2
                        int z = 1;
                        while (z < s.length()) {
                            long nn = 0;
                            long bb = Long.parseLong(s.substring(0, z));
                            long cc = Long.parseLong(s.substring(z));
                            if (bb > 0 && cc > 0)
                                nn = bb + cc;
                            if (nn == j) {
                                myKaprekar.add(nn);
                                break;
                            } else {
                                z++;
                            }
                        }
                    }
                } else {
                    if (k == j) {
                        myKaprekar.add(k);
                    }
                }
            }

            if (myKaprekar.size() > 0) {
                for (long ll : myKaprekar) {
                    System.out.print(ll + " ");
                }
            } else {
                System.out.println("INVALID RANGE");
            }
        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {
        kaprekarNumbers(1, 99999);
        //1 9 45 55 99 297 703 999 2223 2728 4950 5050 7272 7777 9999
    }
}
