package com.wjahatsyed.hackerrank.sample_test_questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 7/19/2020.
 */
public class FindNumberInArray {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(1);
        System.out.println(
                findNumber(myList, 1));
    }

    public static String findNumber(List<Integer> arr, int k) {
        String msg = "";
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                msg = "YES";
                return msg;
            } else {
                msg = "NO";
            }
        }
        return msg;

    }
}
