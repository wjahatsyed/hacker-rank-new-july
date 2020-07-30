package com.wjahatsyed.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Syed Wajahat on 7/23/2020.
 * Practice -> Algorithms -> Implementation -> Flatland Space Stations
 * n: the number of cities
 * c: an integer array that contains the indices of cities with a space station, 1-based indexing
 */
public class MyClass_7 {
    static int flatlandSpaceStations(int n, int[] c) {
        int[] array = new int[n];
        List<Integer> integerList = new ArrayList<>();
        int allDistance = 0;
        for (int j : c) {
            array[j] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1) {
                for (int j = 0; j < array.length; j++) {

                    if (array[j] == 1) {
                        int temp = Math.abs(i - j);
                        if (allDistance > 0 && allDistance > temp) {
                            allDistance = Math.min(allDistance, temp);
                        } else if (allDistance > 0 && allDistance > temp) {
                            allDistance = Math.max(allDistance, temp);
                        } else {
                            allDistance = temp;
                        }

                    }
                }
                integerList.add(allDistance);
            }

        }
        Collections.sort(integerList);
        return integerList.size() > 0 ? integerList.get(integerList.size() - 1) : 0;
    }

    public static void main(String[] args) {
        int[] arr = {0, 4};
        int n = 5;
        System.out.println(flatlandSpaceStations(n, arr));
    }
}
