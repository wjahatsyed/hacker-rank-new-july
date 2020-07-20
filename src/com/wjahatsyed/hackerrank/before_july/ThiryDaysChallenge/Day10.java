package ThiryDaysChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Syed Wajahat on 8/22/2019.
 */
public class Day10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int conOne = 0;
        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;
            integerList.add(remainder);

        }
        for (int i = 0; i < integerList.size(); i++) {
            int consective1 = 0;
            int j = i + 1;
            if (integerList.get(i) == 1) {
                consective1++;
                while (j < integerList.size()) {
                    if (integerList.get(j) == 1) {
                        consective1++;
                        j++;
                    } else {
                        break;
                    }
                }
            }
            conOne = Math.max(conOne, consective1);
        }


        System.out.println(conOne);
        scanner.close();
    }
}
