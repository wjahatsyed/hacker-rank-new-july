import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 8/30/2019.
 */
public class DynamicArray {

    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> tracker = new ArrayList<List<Integer>>(n);
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            tracker.add(new ArrayList<Integer>());
        }
        int lastAnswer = 0;
        for (List<Integer> list : queries) {
            int query = list.get(0);
            int x = list.get(1);
            int y = list.get(2);
            int choice = (x ^ lastAnswer) % n;

            if (query == 1) {
                tracker.get(choice).add(y);
            } else {
                int size = tracker.get(choice).size();
                lastAnswer = tracker.get(choice).get(y % size);
                resultList.add(lastAnswer);
            }
        }
        return resultList;
    }
}
