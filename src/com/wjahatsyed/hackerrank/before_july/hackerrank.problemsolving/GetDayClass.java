import java.time.DayOfWeek;
import java.time.LocalDate;


/**
 * Created by Syed Wajahat on 9/5/2019.
 */
public class GetDayClass {
    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString();
    }

    public static void main(String[] args) {
        int month = 8;
        int date = 5;
        int year = 2015;
        findDay(month, date, year);

    }
}
