package com.company;

import java.util.*;

/**
 * Created by Syed Wajahat on 7/31/2019.
 */
public class Main4 {
    public static void main(String[] args) {
        
    }

    // Complete the divisibleSumPairs function below.

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int divisibleSumPairs = 0;
        int value = 0;

        //length of array
        //k is the divisor number here
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    divisibleSumPairs++;
                }
            }
        }
        return divisibleSumPairs;
    }

    // Complete the migratoryBirds function below.
    /*
    Using maxEntry Map.Entry for finding maximum
     */
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> theMap = new TreeMap<>();
        for (int a : arr) {
            if (theMap.containsKey(a)) {
                theMap.put(a, theMap.get(a) + 1);
            } else {
                theMap.put(a, 1);
            }
        }

        System.out.println(theMap);

        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : theMap.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }


}
