package com.wjahatsyed.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Syed Wajahat on 7/19/2020.
 * Practice -> Algorithms -> Implementation -> Sequence Equation
 * <p>
 * Complete the permutationEquation function in the editor below. It should return an array of integers that represent the values of y.
 * permutationEquation has the following parameter(s):
 * p: an array of integers
 */
public class MyClass_1 {
    static int[] permutationEquation(int[] p) {
        int[] arr = new int[p.length];
        Map<Integer, Integer> myMap = new HashMap<>();
        try {
            for (int i = 1; i <= p.length; i++) {
                myMap.put(i, p[i - 1]);
            }
            for (int i = 1; i <= myMap.size(); i++) {
                int temp = getKeyByValue(myMap, i);
                int temp_2 = getKeyByValue(myMap, temp);
                arr[i - 1] = temp_2;

            }
        } catch (Exception ex) {
            //print anything
        }

        return arr;
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1};
        permutationEquation(arr);
    }
}
