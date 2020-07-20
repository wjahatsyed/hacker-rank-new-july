package ThiryDaysChallenge;

/**
 * Created by Syed Wajahat on 8/13/2019.
 */
public class Operators {
    public static void main(String[] args) {
        solve(12.00, 20, 8);
    }


    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double totalCost;
        double tip = tip_percent * 0.01 * meal_cost;
        double tax = tax_percent * 0.01 * meal_cost;
        totalCost = meal_cost + tip + tax;

        System.out.println(Math.round(totalCost));

    }

}
