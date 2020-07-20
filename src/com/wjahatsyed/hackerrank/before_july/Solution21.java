import java.util.*;

/**
 * Created by Syed Wajahat on 9/18/2019.
 */
public class Solution21 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1659);
        integerList.add(710);
        integerList.add(710);

        integerList.add(7);

        System.out.println(
                getMinimumUniqueSum(integerList));
    }

    public static int getMinimumUniqueSum(List<Integer> arr) {
        Collections.sort(arr);
        int total = 0;
        int count = 1;
        System.out.println(arr);
        try {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == arr.get(i + 1)) {
                    arr.remove(arr.indexOf(arr.get(i + 1)));
                    arr.add(arr.get(i) + 1);
                    total++;
                    getMinimumUniqueSum(arr);
                }
            }
        } catch (Exception ex) {

        }
        System.out.println(arr);
        for (int k : arr) {
            total += k;
        }
        return total;

    }


}
