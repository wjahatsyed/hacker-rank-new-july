package com.company;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Syed Wajahat on 8/15/2019.
 */
public class EqualizeArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 3, 3, 3};
        System.out.println(equalizeArray(arr));
    }

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        Set<Integer> mySet = new TreeSet<>();
        Map<Integer, Integer> myMap = new TreeMap<>();
        for (int i : arr) {
            if (myMap.containsKey(i)) {
                myMap.put(i, myMap.get(i) + 1);
            } else {
                myMap.put(i, 1);
            }
        }

        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        return arr.length - maxEntry.getValue();

    }

}
