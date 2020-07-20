package com.company;

/**
 * Created by Syed Wajahat on 8/13/2019.
 */
public class HalloweenSale {
    public static void main(String[] args) {
        System.out.print(howManyGames(100, 99, 81, 180));
    }

    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        //p first price
        //p-d next price
        //d will remain the price until m
        int gamesCount = 0;


        if (p <= s) {
            if (p != m) {
                int price = p;
                s -= price;
                gamesCount++;
                price -= d;
                while (price >= m && price <= s) {
                    s -= price;
                    price -= d;
                    gamesCount++;

                }
                while (price <= s ) {
                    price = m;
                    if(m<=s) {
                        s -= price;
                        gamesCount++;
                    }
                }
            } else {
                while (s >= m) {
                    s -= m;
                    gamesCount++;
                }
            }
        }

        return gamesCount;

    }
}
