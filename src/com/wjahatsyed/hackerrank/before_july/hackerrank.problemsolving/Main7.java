package com.company;

import java.util.*;

/**
 * Created by Syed Wajahat on 8/6/2019.
 */
public class Main7 {
    public static void main(String[] args) {
        int b = 10;
        int[] keyboards = {4};
        int[] drives = {5};
        System.out.println(getMoneySpent(keyboards, drives, 5));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        //Take a ArrayList to store the total price which are less than or equal to b
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int totalPrice = keyboards[i] + drives[j];
                if (totalPrice <= b) {
                    integerList.add(totalPrice);
                }
            }
        }

        if (integerList.size() > 0) {
            Collections.sort(integerList);
            return integerList.get(integerList.size() - 1);
        }

        return -1;

    }
}
