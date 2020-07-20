import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Syed Wajahat on 8/25/2019.
 */
public class ArraysDS {
    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 2, 2, 8};
        cutTheSticks(arr);
    }

    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        List<Integer> integerList = new ArrayList<>();

        List<Integer> finalList = new ArrayList<>();

        for (int i : arr) {
            integerList.add(i);
        }

        while (integerList.size() > 0) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) - integerList.get(0) > 0) {
                    temp.add(integerList.get(i) - integerList.get(0));
                }
            }

            finalList.add(integerList.size());
            integerList = temp;

        }

        arr = new int[finalList.size()];
        for (int k = 0; k < finalList.size(); k++) {
            arr[k] = finalList.get(k);
        }
        return arr;

    }
}
