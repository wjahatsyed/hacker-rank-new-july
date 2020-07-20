package com.wjahatsyed.hackerrank.sample_test_questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 7/19/2020.
 */
public class FindOddNumbersInArray {
    public static void main(String[] args) {

        System.out.println(oddNumbers(1, 5));

    }

    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> oddNumbersList = new ArrayList<>();
        int n = l;
        while (n <= r) {
            if (n % 2 != 0) {
                oddNumbersList.add(n);

            }
            n++;
        }
        return oddNumbersList;
    }
}
