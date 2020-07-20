package ThiryDaysChallenge;

/**
 * Created by Syed Wajahat on 8/20/2019.
 */
public class Day9 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n-- * factorial(n);
        }
    }

}
