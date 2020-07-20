/**
 * Created by Syed Wajahat on 8/26/2019.
 */
public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:40:22AM";
        System.out.println(timeConversion(s));
    }

    static String timeConversion(String s) {
        String newTime = "";
        if (s.charAt(s.length() - 2) == 'P') {
            Integer i = Integer.valueOf(s.substring(0, 2));
            if (i != 12) {
                i = i + 12;
            }
            newTime = i + s.substring(2, s.indexOf('P'));
        } else {
            if (Integer.valueOf(s.substring(0, 2)) == 12) {
                newTime = "00" + s.substring(2, s.length() - 2);
            } else {
                newTime = s.substring(0, s.length() - 2);
            }
        }
        return newTime;

    }

}
