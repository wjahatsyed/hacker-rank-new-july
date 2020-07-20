package hackerrank2;

import java.util.*;

/**
 * Created by Syed Wajahat on 7/26/2019.
 */

public class LexiographicString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int length = A.length() + B.length();

        System.out.println(length);

        int i = A.compareTo(B);

        if (i > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        String sA = A.substring(0, 1).toUpperCase();
        String sB = B.substring(0, 1).toUpperCase();
        Character Bb = B.charAt(0);
        System.out.println(sA + A.substring(1) + " " + sB + B.substring(1));

    }
}




