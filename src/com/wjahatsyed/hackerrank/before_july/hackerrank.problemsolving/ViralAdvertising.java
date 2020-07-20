/**
 * Created by Syed Wajahat on 9/4/2019.
 */
public class ViralAdvertising {
    public static void main(String[] args) {

        System.out.println(viralAdvertising(3));
    }

    static int viralAdvertising(int n) {
        int cumulative = 0;
        int shared = 5;
        int liked = 2;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                cumulative = 2;
            } else {
                shared = Math.floorDiv(shared, 2) * 3;
                liked = Math.floorDiv(shared, 2);
                cumulative += liked;
            }
        }
        return cumulative;

    }
}
