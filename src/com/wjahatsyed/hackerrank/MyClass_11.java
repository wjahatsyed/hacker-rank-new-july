package com.wjahatsyed.hackerrank;

/**
 * Created by Syed Wajahat on 7/30/2020.
 * Algorithms -> Implementation -> Append and Delete
 * String s, the initial string, String t, the desired final string
 * and int k, the number of operations allowed.
 */
public class MyClass_11 {
    static String appendAndDelete(String s, String t, int k) {
        if (s.equals(t)) {
            int opApplied = 0;
            opApplied = s.length() * 2 + 1;
            if (opApplied <= k) {
                return "Yes";
            } else {
                return "No";
            }
        } else {
            if (s.length() >= t.length()) {
                String tempS = "";
                for (int i = 0; i < t.length(); i++) {
                    if (t.charAt(i) == s.charAt(i)) {
                        tempS += t.charAt(i);
                    } else {
                        break;
                    }
                }
                int m = t.length() - tempS.length();
                int n = s.substring(tempS.length()).length();
                if (n + m <= k) {
                    return "Yes";
                }
            } else {
                String tempS = "";
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == t.charAt(i)) {
                        tempS += s.charAt(i);
                    } else {
                        break;
                    }
                }

                int m = s.length() + 1;
                int n = t.length();
                if (n + m <= k) {
                    return "Yes";
                }
            }
        }
        return "No";
    }


    public static void main(String[] args) {

        System.out.println(appendAndDelete("zzzzz", "zzzzzzz", 4));
    }

}
