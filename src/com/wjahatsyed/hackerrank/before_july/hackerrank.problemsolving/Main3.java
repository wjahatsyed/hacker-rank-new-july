package com.company;

import java.util.*;

/**
 * Created by Syed Wajahat on 7/30/2019.
 */
public class Main3 {
    public static void main(String[] args) {
      
    }

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        //scores = [10,5,20,20,4,5,20,25,1]
        int[] breakingRecords = new int[2];
        int minScore = scores[0];
        int maxScore = scores[0];

        int minScoreTimes = 0, maxScoreTimes = 0;

        for (int j = 1; j < scores.length; j++) {
            if (minScore > scores[j]) {
                minScore = scores[j];
                minScoreTimes++;
            } else if (scores[j] > maxScore) {
                maxScore = scores[j];
                maxScoreTimes++;
            }
        }

        breakingRecords[0] = maxScoreTimes;
        breakingRecords[1] = minScoreTimes;
        return breakingRecords;

    }

    // Complete the birthday function below.
    //difficult question
    static int birthday(List<Integer> s, int d, int m) {
        int chocolateCount = 0;
        //if m = 1
        if (m == 1) {
            for (int i = 0; i < s.size(); i++) {
                if (s.get(i) == d) {
                    chocolateCount++;
                }
            }
        }
        //else if m >1
        else {
            int localM = m;
            for (int i = 0; i < s.size(); i++, m++) {
                int newI = 0;
                int j = i;
                int iterationCount = 0;
                while (j < m && m <= s.size()) {
                    if (s.get(i) < d) {
                        newI += s.get(j);
                        j++;
                        iterationCount++;
                        if (newI > d) {
                            break;
                        } else if (newI == d && iterationCount == localM) {
                            chocolateCount++;
                        }
                    } else {
                        break;
                    }
                }

            }
        }

        return chocolateCount;

    }
}
