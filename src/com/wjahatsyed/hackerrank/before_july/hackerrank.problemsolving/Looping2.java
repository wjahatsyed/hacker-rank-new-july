package hackerrankChallenges.src;

/**
 * Created by Syed Wajahat on 7/23/2019.
 */
public class Looping2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int n = 5;
        int value = 0;
        int count = 0;

        for (int j = 0; j < n; j++) {
            if (j == 0) {
                value = a + (int) Math.pow(2, j) * b;
            } else {
                value = (int) Math.pow(2, j) * b;
            }
            count += value;
            System.out.print(count + " ");
        }

        System.out.println();
    }
}