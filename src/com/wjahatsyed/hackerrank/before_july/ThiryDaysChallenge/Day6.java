package ThiryDaysChallenge;

import java.util.Scanner;

/**
 * Created by Syed Wajahat on 8/18/2019.
 */
public class Day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strings = scanner.nextInt();
        String[] array = new String[strings];

        for (int i = 0; i < strings; i++) {
            array[i] = scanner.next();
        }
        scanner.close();

        for (String s : array) {
            String evenString = "";
            String oddString = "";
            for (int i = 0; i < s.length(); i++) {
                if (i == 0 || i % 2 == 0) {
                    evenString = evenString + s.charAt(i);
                } else {
                    oddString = oddString + s.charAt(i);
                }
            }
            System.out.println(evenString + " " + oddString);
        }
    }
}
