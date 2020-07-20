package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Syed Wajahat on 8/11/2019.
 */
public class LisaWorkBook {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 10};
        System.out.println(workbook(5, 3, arr));
    }


    static int workbook(int n, int k, int[] arr) {
        //n = number of chapter
        //k = maximum number of problems per page
        //arr number of problem per page

        Map<Integer, Integer> questionOnPages = new HashMap<>();
        int pagNumber = 1;
        int count = 0;
        boolean pageIncremen;
        for (int i = 0; i < arr.length; i++) {
            int question = 1;
            int questionsInChapter = arr[i];
            int c = 1;
            while (question <= questionsInChapter) {

                if (question > k && c > k) {
                    pagNumber++;
                    c = 1;
                }
                questionOnPages.put(question++, pagNumber);
                c++;
            }

            for (int l : questionOnPages.keySet()) {
                if (l == questionOnPages.get(l)) {
                    count++;
                }
            }
            pagNumber++;
            questionOnPages.clear();


        }


        return count;

    }
}
