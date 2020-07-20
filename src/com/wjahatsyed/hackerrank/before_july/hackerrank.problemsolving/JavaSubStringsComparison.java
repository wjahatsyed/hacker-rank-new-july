package hackerrank2;

import java.util.Scanner;

/**
 * Created by Syed Wajahat on 7/26/2019.
 */
public class JavaSubStringsComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.Set<String> lexicographicSet = new java.util.TreeSet<>();
        java.util.List<String> lexicographicList = new java.util.ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int newI = i;
            int oldK = k;
            for (int j = k; j < s.length() + 1; ) {
                if (newI < s.length() && k <= s.length()) {
                    lexicographicSet.add(s.substring(newI, k));
                    newI += 3;
                    k += 3;
                } else {
                    break;
                }
            }

            k = oldK + 1;
        }

        if (lexicographicSet.size() > 0) {
            lexicographicSet.forEach(lexicographicList::add);
        }

        smallest = lexicographicList.get(0);
        largest = lexicographicList.get(lexicographicList.size() - 1);


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
