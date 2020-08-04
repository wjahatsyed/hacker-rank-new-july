package com.wjahatsyed.hackerrank;

/**
 * Created by Syed Wajahat on 8/4/2020.
 * Algorithms, Strings, CamelCase
 */
public class MyClass_12 {
    static int camelcase(String s) {
        int numberOfWords = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                numberOfWords++;
            }
        }
        return numberOfWords;
    }

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
}
