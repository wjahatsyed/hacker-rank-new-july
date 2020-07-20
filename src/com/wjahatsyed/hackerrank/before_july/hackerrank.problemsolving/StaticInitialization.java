package hackerrankChallenges.src;

import java.util.Scanner;

/**
 * Created by Syed Wajahat on 7/24/2019.
 */
public class StaticInitialization {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = Integer.valueOf(scan.next());
        H = Integer.valueOf(scan.next());

        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}
