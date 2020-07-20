package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 7/31/2019.
 */
public class Main5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            list.add(i + 1);
        }
        bonAppetit(list, 2814, 249990732);

    }

    static String dayOfProgrammer(int year) {
        String date = "";
        int daysInMonths = 31 + 31 + 30 + 31 + 30 + 31 + 31;
        int totalDays;
        int dayOfMonth;
        if (year > 1918) {

            if (year % 4 == 0 && year % 100 != 0) {
                totalDays = daysInMonths + 29;
            } else {
                totalDays = daysInMonths + 28;
            }

        } else {
            if (year % 4 == 0) {
                totalDays = daysInMonths + 29;
            } else {
                totalDays = daysInMonths + 28;
            }
        }

        if (totalDays < 256) {
            if (year == 2000 || year == 2400) {
                dayOfMonth = 12;
            } else if (year == 1918) {
                dayOfMonth = 26;
            } else {
                dayOfMonth = 256 - totalDays;

            }
            date = dayOfMonth + "" + ".09." + year;

        }


        return date;
    }


    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {

        double actualBill = 0.0;

        for (int i : bill) {
            if (bill.get(k) != i) {
                actualBill += i;
            }
        }

        double difference = b - (actualBill / 2);
        if (difference == 0.0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println((int) difference);
        }
    }

}



