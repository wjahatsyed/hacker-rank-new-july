package com.wjahatsyed.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 7/19/2020.
 */
public class SeparatingStudents {
    public static int minMoves(List<Integer> avg) {
        int noOfOnes = 0;

        // find total number of all in the array
        for (int i = 0; i < avg.size(); i++) {
            if (avg.get(i) == 1)
                noOfOnes++;
        }

        // length of subarray to check for
        int x = noOfOnes;

        int maxOnes = Integer.MIN_VALUE;

        // array to store number of 1's upto
        // ith index
        int preCompute[] = new int[avg.size()];

        // calculate number of 1's upto ith
        // index and store in the array preCompute[]
        if (avg.get(0) == 1)
            preCompute[0] = 1;
        for (int i = 1; i < avg.size(); i++) {
            if (avg.get(i) == 1) {
                preCompute[i] = preCompute[i - 1] + 1;
            } else
                preCompute[i] = preCompute[i - 1];
        }

        // using sliding window technique to find
        // max number of ones in subarray of length x
        for (int i = x - 1; i < avg.size(); i++) {
            if (i == (x - 1))
                noOfOnes = preCompute[i];
            else
                noOfOnes = preCompute[i] - preCompute[i - x];

            if (maxOnes < noOfOnes)
                maxOnes = noOfOnes;
        }

        // calculate number of zeros in subarray
        // of length x with maximum number of 1's
        int noOfZeroes = x - maxOnes;

        return noOfZeroes;

    }

    public static void main(String[] args) {
        List<Integer> avg = new ArrayList<>();

        avg.add(1);
        avg.add(1);
        avg.add(1);
        avg.add(1);
        avg.add(0);
        avg.add(1);
        avg.add(0);
        avg.add(1);
        System.out.println(avg);
        System.out.println(minMoves(avg));

    }
}
