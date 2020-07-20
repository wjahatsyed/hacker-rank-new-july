import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 8/26/2019.
 */
public class FunnyString {
    public static void main(String[] args) {
        String s = "acxz";
        funnyString(s);
    }

    static String funnyString(String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = (int) s.charAt(i);
        }

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        int[] arr2 = new int[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            arr2[i] = (int) sb.charAt(i);
        }

        List<Integer> diff1 = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            diff1.add(Math.abs(arr[i] - arr[i + 1]));
        }

        List<Integer> diff2 = new ArrayList<>();
        for (int i = 0; i < arr2.length - 1; i++) {
            diff2.add(Math.abs(arr2[i] - arr2[i + 1]));
        }

        if (diff1.equals(diff2)) {
            return "Funny";
        }

        return "Not Funny";
    }
}
