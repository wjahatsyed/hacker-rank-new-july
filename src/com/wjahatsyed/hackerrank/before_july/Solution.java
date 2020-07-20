import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Syed Wajahat on 9/18/2019.
 */
public class Solution {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(0);
        integerList.add(1);
        integerList.add(0);
        integerList.add(0);
        integerList.add(0);
        integerList.add(0);
        integerList.add(1);
        System.out.println(minMoves(integerList));
    }

    public static int minMoves(List<Integer> avg) {
        int count = 0;
        if (avg.get(0) == 1) {
            for (int i = 1; i < avg.size(); i++) {
                if (i + 1 < avg.size()) {
                    if (avg.get(i) == 0 && avg.get(i + 1) != 0) {
                        count++;
                    }
                }
            }
        }
        if (count > 0) {
            count += 1;
        }
        return count;
    }
}
