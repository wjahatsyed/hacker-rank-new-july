import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Syed Wajahat on 8/28/2019.
 */
public class EqualStacks {
    public static void main(String[] args) {
        int[] h1 = {3, 2, 1, 1, 1};
        int[] h2 = {4, 3, 2};
        int[] h3 = {1, 1, 4, 1};
        equalStacks(h1, h2, h3);

    }

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        Queue<Integer> stack1 = new LinkedList<>();
        Queue<Integer> stack2 = new LinkedList<>();
        Queue<Integer> stack3 = new LinkedList<>();
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for (int i = 0; i < h1.length; i++) {
            int value = h1[i];
            stack1.add(value);
            total1 += value;
        }


        for (int i = 0; i < h2.length; i++) {
            int value = h2[i];
            stack2.add(value);
            total2 += value;
        }

        for (int i = 0; i < h3.length; i++) {
            int value = h3[i];
            stack3.add(value);
            total3 += value;
        }

        while (!((total1 == total2) && (total2 == total3) && (total1 == total3))) {
            if (total1 >= total2 && total1 >= total3) {
                total1 -= stack1.remove();
            } else if (total2 >= total1 && total2 >= total3) {
                total2 -= stack2.remove();
            } else {
                total3 -= stack3.remove();
            }
        }


        return total1;
    }


}
