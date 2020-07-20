package com.wjahatsyed.hackerrank;

/**
 * Created by Syed Wajahat on 7/19/2020.
 */
public class MyClass {
    public static String isPossible(int a, int b, int c, int d) {
        int e = a+b;
        int f = a+b;
        if(e<c){
            isPossible(e,b,c,d);
        }else if(e>c){
            return "NO";
        }

        if(f<c){
            isPossible(a,b,c,f);
        }
        return "YES";
    }

    public static void main(String[] args) {
        isPossible(1, 1, 5, 2);
    }


}
