import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 9/18/2019.
 */
class GFG {
    // To find minimum sum
    // of unique elements.
    static int getMinimumUniqueSum(List<Integer> list) {
        int sum = list.get(0);
        int n = list.size();
        for (int i = 1; i < n; i++) {
            if (list.get(i) == list.get(i - 1)) {

                int j = i;
                while (j < n && list.get(j) <= list.get(j - 1)) {


                        list.set(j, list.get(j)+1);

                }
            }
            sum = sum + list.get(i);
        }

        return sum;
    }

    // Driver code
    /*public static void main(String[] args) {
        int arr[] = {2, 2, 4, 5};
       List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(2);
        integerList.add(4);
        integerList.add(5);
        System.out.println(minSum(integerList));
    }*/
}
