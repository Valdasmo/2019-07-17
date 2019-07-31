package lt.bit.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class JavaDates {
    public static void main(String[] args) {
//        checkDate();
//        checkLocalDate();
//        checkLocalDateTime();
        calculateDifferentsDate();
    }

    private static void calculateDifferentsDate() {
        LocalDate dateOne = LocalDate.of(2019, 7, 31);
        LocalDate dateTwo = LocalDate.of(2018, 3, 23);

        long days = ChronoUnit.DAYS.between(dateOne, dateTwo);
        System.out.println(days);

        long weeks = ChronoUnit.WEEKS.between(dateOne, dateTwo);
        System.out.println(weeks);
    }

    private static void checkLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    private static void checkLocalDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.parse("2019-07-13");
        System.out.println(localDate);

        localDate = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println(localDate);
    }

    private static void checkDate() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        String timeFormat = "yyyy-MM-dd hh:mm:ss";
        date = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(timeFormat);
        String formattedDate = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(formattedDate);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").
                format(Calendar.getInstance().getTime()));
    }


}
