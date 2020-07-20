package hackerrankChallenges.src;

import java.util.*;

/**
 * Created by Syed Wajahat on 7/23/2019.
 */
public class SocksPair {
    public static void main(String[] args) {
        int i = 9;
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(i, arr));
    }

    static int sockMerchant(int n, int[] ar) {
        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                if (i != j && ar[i] != 0 && ar[j] != 0) {
                    if (ar[i] == ar[j]) {
                        count++;
                        ar[i] = 0;
                        ar[j] = 0;
                    }
                }
            }
        }

        return count;
    }
}