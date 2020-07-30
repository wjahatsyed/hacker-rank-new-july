package com.wjahatsyed.hackerrank;

import java.util.*;

/**
 * Created by Syed Wajahat on 7/26/2020.
 * Hackerrank Test Question - Sr. Software Engineer
 */
public class MyClass_10 {
    public static int getMinimumUniqueSum(List<Integer> arr) {
        int minimum = 0;
        int count = 0;
        boolean c = true;
        Collections.sort(arr);
        Set<Integer> set = new TreeSet<>();
        for (int i : arr) {
            c=true;
            boolean b = set.add(i);
            if (!b) {
                while (c) {
                    i++;
                    if (arr.contains((new Integer(i)))) {
                        if(!set.contains(new Integer(i))){
                            c= false;
                            set.add(i);
                        }else{
                            c=true;
                        }
                    } else {
                        if(!set.contains(new Integer(i))){
                            c = false;
                            set.add(i);
                        }
                    }
                }
            }
        }
        for (int j : set) {
            minimum += j;
        }
        return minimum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1659);
        integerList.add(710);

        integerList.add(710);
        integerList.add(1730);
        integerList.add(1808);
        integerList.add(2043);
        integerList.add(1613);
        integerList.add(1841);
        integerList.add(1328);
        integerList.add(504);
        integerList.add(1730);
        integerList.add(2545);
        integerList.add(493);
        integerList.add(879);
        integerList.add(1441);
        integerList.add(2043);
        integerList.add(1613);
        integerList.add(710);
        integerList.add(1613);
        integerList.add(1250);


        System.out.print(getMinimumUniqueSum(integerList));
    }
}
