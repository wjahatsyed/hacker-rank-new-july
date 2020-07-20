package com.company;

/**
 * Created by Syed Wajahat on 8/11/2019.
 */
public class InsertionSortPart1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 3};
        insertionSort1(5, arr);
    }

    static void insertionSort1(int n, int[] arr) {
        boolean isSorted = false;

        while (!isSorted) {
            boolean isShifted = false;
            int temp = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    isShifted = true;
                    isSorted = false;

                } else {
                    isSorted = true;
                }
                if (isShifted) {
                    for (int j : arr) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                    arr[i] = temp;
                    break;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();


    }
}
