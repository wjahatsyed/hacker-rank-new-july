package hackerrankChallenges.src;



/**
 * Created by Syed Wajahat on 7/23/2019.
 */

public class FindValleys {
    /*
    This code is to find hiking by going into valleys and moutains.
    This is a hackerrank challenge.
     */
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int countVallies = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                count--;
            } else {
                count++;
                if (count == 0) {
                    countVallies++;
                }
            }

        }
        return countVallies;
    }

    public static void main(String[] args) {
        //No of Steps taken by the hiker
        int n = 8;
        //U represents uphill and D represents Downhill
        String s = "UDDDUDUU";
        System.out.println(countingValleys(n, s));

    }


}
