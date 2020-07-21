package com.wjahatsyed.hackerrank.before_july;

/**
 * Created by Syed Wajahat on 7/20/2020.
 */
public class MyClass3 {
    static String caesarCipher(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean small = (c >= 'a' && c <= 'z');
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                c += k;
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                    if (!(c >= 'a' && c <= 'z') ) {
                        c -= k;
                        int newA = 'z' - c;
                        newA += 1;
                        c = 'a';
                        c += k-1;
                        c -= newA;
                    } else if (!((c >= 'A' && c <= 'Z'))) {
                        c -= k;
                        int newA = 'Z' - c;
                        newA += 1;
                        c = 'A';
                        c += k-1;
                        c -= newA;
                    }
                }
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("Z", 3));
    }
}
