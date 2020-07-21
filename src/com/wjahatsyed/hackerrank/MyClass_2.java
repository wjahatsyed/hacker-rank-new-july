package com.wjahatsyed.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 7/20/2020.
 * Practice -> Algorithms -> Sorting -> Quicksort 1 - Partition
 */
public class MyClass_2 {
    static int[] quickSort(int[] arr) {
        int count = 0;
        int[] tempArr = new int[arr.length];
        int pivot = arr[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > pivot) {
                    right.add(arr[i]);
                } else if (arr[i] == pivot) {
                    equal.add(arr[i]);
                } else {
                    left.add(arr[i]);
                }
            }

            for (int k = 0; k < left.size(); k++) {
                tempArr[k] = left.get(k);
                count++;
            }

            for (int l = 0; l < equal.size(); l++) {
                tempArr[count] = equal.get(l);
                count++;
            }
            for (int j = 0; j < right.size(); j++) {
                tempArr[count] = right.get(j);
                count++;
            }
        } else {
            tempArr[0] = arr[0];
        }
        for (int z : tempArr) {
            System.out.println(z);
        }
        return tempArr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 7, 2};
        quickSort(arr);
    }
}
