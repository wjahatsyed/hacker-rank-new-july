package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 1, -1, -1, 0};
        int[] array2 = {3, 1, 7, 5, 9};
        int[] array3 = {4, 1, 4, 4, 5, 6};
        plusMinus(array);
        staircase(6);
        miniMaxSum(array2);
        System.out.println(birthdayCakeCandles(array3));
    }

    //Find the ratio of positive, negative and zero in a array of integers
    static void plusMinus(int[] arr) {
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeros = 0;
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    positiveNumbers++;
                } else if (arr[i] < 0) {
                    negativeNumbers++;
                } else {
                    zeros++;
                }
            }
        }
        double positiveRatio = (double) positiveNumbers / (double) arr.length;
        double negativeRatio = (double) negativeNumbers / (double) arr.length;
        double zerosRatio = (double) zeros / (double) arr.length;
        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zerosRatio);

    }


    //stair-case problem
    /*
         #
        ##
       ###
      ####
     #####
    ######

     */
    static void staircase(int n) {
        int j = 1;
        while (n > 0) {

            for (int i = n - 1; i > 0; i--) {
                System.out.print(" ");
            }
            printStais(j);
            n--;
            j++;

        }

    }

    static void printStais(int k) {
        for (int i = 0; i < k; i++) {
            System.out.print("#");
        }
        System.out.println();

    }

    //min-max sum function
    static void miniMaxSum(int[] arr) {
        Long minNumber = 0L;
        Long maxNumber = 0L;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            minNumber += arr[i];
        }

        for (int j = 1; j < arr.length; j++) {
            maxNumber += arr[j];
        }
        System.out.println(minNumber + " " + maxNumber);
    }

    //find tallest candle(s) to be blown
    static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        List<Integer> maxCandles = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == ar[ar.length - 1]) {
                maxCandles.add(ar[i]);
            }
        }
        return maxCandles.size();

    }
}
