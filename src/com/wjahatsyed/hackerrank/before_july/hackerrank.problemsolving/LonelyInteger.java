/**
 * Created by Syed Wajahat on 9/3/2019.
 */
public class LonelyInteger {
    public static void main(String[] args) {
        int[] a = {4, 9, 95, 93, 57, 4, 57, 93, 9};
        System.out.println(lonelyinteger(a));
    }

    static int lonelyinteger(int[] a) {
        int uniqueNumber = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    if (a[i] == a[j]) {
                        isUnique = false;
                        break;
                    }
                } else {
                    continue;
                }

            }
            if (isUnique) {
                uniqueNumber = a[i];
            }
        }
        return uniqueNumber;

    }
}
