/**
 * Created by Syed Wajahat on 9/4/2019.
 */
public class FairRations {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7};
        System.out.println(fairRations(a));
        int[] b = {2, 3, 4, 5, 6};
        System.out.println(fairRations(b));
        int[] c = {1, 2};
        System.out.println(fairRations(c));
    }

    static int fairRations(int[] B) {
        int count = 0;
        boolean isOdd = false;
        for (int i = 0; i < B.length; i++) {
            if (B[i] % 2 != 0) {
                B[i] = B[i] + 1;
                count++;
                if (i - 1 >= 0 && B[i - 1] % 2 != 0) {
                    B[i - 1] = B[i - 1] + 1;
                    count++;
                } else if (i + 1 < B.length) {
                    B[i + 1] = B[i + 1] + 1;
                    count++;
                } else {
                    B[i - 1] = B[i - 1] + 1;
                    count++;
                }
            }
        }
        for (int i : B) {
            if (i % 2 != 0) {
                isOdd = true;
            }
        }
        if (isOdd) {
            return 0;
        }
        return count;
    }
}
