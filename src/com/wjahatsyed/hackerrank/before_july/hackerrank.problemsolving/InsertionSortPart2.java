package com.company;

/**
 * Created by Syed Wajahat on 8/11/2019.
 */
public class InsertionSortPart2 {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort2(8, arr);
    }

    static void insertionSort2(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            boolean rightPosition = false;
            if (arr[i] > arr[i + 1]) {
                //please sort the array
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
                if (i > 0) {
                    if (arr[i] > arr[i - 1] && arr[i] < arr[i + 1]) {
                        rightPosition = true;
                    } else {
                        for (int j = 0; j < i; j++) {
                            if (arr[j] > arr[i]) {
                                int temp2 = arr[j];
                                arr[j] = arr[i];
                                arr[i] = temp2;
                                rightPosition = true;
                            }
                        }
                    }
                }else{
                    rightPosition = true;
                }
            } else {
                rightPosition = true;
            }
            if (rightPosition) {
                for (int j : arr) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
