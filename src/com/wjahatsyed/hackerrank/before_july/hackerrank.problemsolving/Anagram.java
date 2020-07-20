import java.util.Scanner;


/**
 * Created by Syed Wajahat on 9/5/2019.
 */
public class Anagram {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        java.util.Map<String, Integer> treeMap1 = new java.util.TreeMap<>();
        java.util.Map<String, Integer> treeMap2 = new java.util.TreeMap<>();
        if (a.length() != b.length()) {
            return false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (treeMap1.containsKey(a.substring(i, i + 1))) {
                    treeMap1.put(a.substring(i, i + 1), treeMap1.get(a.substring(i, i + 1)) + 1);
                } else {
                    treeMap1.put(a.substring(i, i + 1), 1);
                }
            }
            for (int i = 0; i < b.length(); i++) {
                if (treeMap2.containsKey(b.substring(i, i + 1))) {
                    treeMap2.put(b.substring(i, i + 1), treeMap2.get(b.substring(i, i + 1)) + 1);
                } else {
                    treeMap2.put(b.substring(i, i + 1), 1);
                }
            }
        }
        if (treeMap1.equals(treeMap2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
