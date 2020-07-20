package com.company;

/**
 * Created by Syed Wajahat on 8/11/2019.
 */
public class FindDigits {
    public static void main(String[] args) {
        int n = 1012;
        System.out.println(findDigits(n));
    }

    static int findDigits(int n) {
        Integer i = Integer.valueOf(n);
        String s = i.toString();
        int count = 0;
        for (int j = 0; j < s.length(); j++) {
            int theNumber = Integer.parseInt(s.substring(j, j + 1));
            if (theNumber != 0) {
                if (n % theNumber == 0) {
                    count++;
                }
            }
        }
        return count;

    }
}
