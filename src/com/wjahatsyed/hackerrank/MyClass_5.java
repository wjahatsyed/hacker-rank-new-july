package com.wjahatsyed.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Syed Wajahat on 7/23/2020.
 * Practice -> Algorithms -> Implementation -> Minimum distances
 */
public class MyClass_5 {
    static int minimumDistances(int[] a) {
        int minimunDistance = 0;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            try {
                for (int j = 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        if (minimunDistance == 0) {
                            minimunDistance = Math.max(minimunDistance, Math.abs(i - j));
                        } else {
                            minimunDistance = Math.min(minimunDistance, Math.abs(i - j));
                        }
                        if (minimunDistance > 0) {
                            integerList.add(minimunDistance);
                        }
                    }
                }
            } catch (Exception ex) {
                //print anything
            }
        }
        Collections.sort(integerList);
        if (integerList.size() > 0) {
            return integerList.get(0);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 4, 1, 7};
        System.out.println(minimumDistances(arr));
    }
}
