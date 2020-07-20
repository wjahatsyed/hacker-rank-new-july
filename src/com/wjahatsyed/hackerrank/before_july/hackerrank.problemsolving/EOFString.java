package hackerRank3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Syed Wajahat on 7/26/2019.
 */
public class EOFString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        int i = 1;
        while (scanner.hasNextLine()) {
            String s = i + " " + scanner.nextLine();
            i++;
            stringList.add(s);
            if (s.contains("end-of-file")) {
                break;
            }
        }
        stringList.forEach(System.out::println);
    }
}
