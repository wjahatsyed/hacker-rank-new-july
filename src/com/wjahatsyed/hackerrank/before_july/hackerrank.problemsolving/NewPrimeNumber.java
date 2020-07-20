package hackerrankChallenges.src;

import java.util.Scanner;

/**
 * Created by Syed Wajahat on 7/24/2019.
 */
public class NewPrimeNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        Integer i = Integer.valueOf(n);
        boolean isPrime = false;
        if (i % 2 != 0) {
            for (int j = 3; j < i / 2; j++) {
                if (i % j != 0) {
                    isPrime = true;
                } else {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        scanner.close();
    }
}
