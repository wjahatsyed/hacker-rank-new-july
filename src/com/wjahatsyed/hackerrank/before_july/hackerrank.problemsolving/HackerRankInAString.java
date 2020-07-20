/**
 * Created by Syed Wajahat on 9/3/2019.
 */
public class HackerRankInAString {
    public static void main(String[] args) {
        String s = "hereiamstackerrank";
        hackerrankInString(s);
    }

    static String hackerrankInString(String s) {
        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");
    }
}
