package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Syed Wajahat on 7/28/2019.
 */
public class Main2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);


        System.out.println(getTotalX(list1, list2));

    }

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        //a location of apple tree
        //b location og orange tree
        List<Integer> applesList = new ArrayList<>();
        List<Integer> orangesList = new ArrayList<>();
        List<Integer> applesInRange = new ArrayList<>();
        List<Integer> orangesInRange = new ArrayList<>();


        for (int i = 0; i < apples.length; i++) {
            applesList.add(apples[i] + a);
        }

        for (int j = 0; j < oranges.length; j++) {
            orangesList.add(oranges[j] + b);
        }


        applesList.forEach(integer -> {
            if (integer >= s && integer <= t) {
                applesInRange.add(integer);
            }
        });

        orangesList.forEach(integer -> {
            if (integer >= s && integer <= t) {
                orangesInRange.add(integer);
            }
        });

        System.out.println(applesInRange.size());
        System.out.println(orangesInRange.size());
    }

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long l = 0L;
        for (int i = 0; i < ar.length; i++) {
            l += ar[i];
        }
        return l;
    }

    //grading student - hacker rank
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedOffGrades = new ArrayList<>();


        for (int i : grades) {
            int roundingOffValue = 5;
            boolean flag = true;
            while (flag) {
                if (i > roundingOffValue) {
                    roundingOffValue += 5;
                } else {
                    flag = false;
                }
            }
            if (i >= 38 && roundingOffValue - i < 3) {
                i = roundingOffValue;
            }


            roundedOffGrades.add(i);


        }

        return roundedOffGrades;


    }

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String status = "NO";
        //If starting point of second kangaroo is greater than of first kangaroo
        if (x2 > x1) {
            if (v2 > v1) {
                return status;
            } else {
                int a = x1 + v1;
                int b = x2 + v2;

                if (a == b) {
                    status = "YES";
                }

                while (a < b) {
                    a += v1;
                    b += v2;
                    if (a == b) {
                        status = "YES";
                    } else if (a > b) {
                        break;
                    }
                }
            }
        } else if (x1 > x2) {
            //if starting point of Kangaroo 1 is greater than Kangaroo 2


        } else {
            if (v1 == v2) {
                status = "YES";
            }
        }
        return status;

    }

    //between 2 sets
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int newI = 0;

        List<Integer> combinedList = new ArrayList<>();
        a.forEach(integer -> combinedList.add(integer));
        b.forEach(integer -> combinedList.add(integer));
        boolean flag = true;

        int i = combinedList.get(0);
        while (i <= combinedList.get(combinedList.size() - 1)) {
            for (int j : combinedList) {
                boolean condition;
                if (a.contains(j)) {
                    condition = i % j != 0;
                } else {
                    condition = j % i != 0;
                }

                if (condition) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
                newI++;
            }
            i++;
        }

        return newI;

    }


}
