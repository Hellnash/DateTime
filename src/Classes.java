import java.time.*;
import java.time.format.DateTimeFormatter;

public class Classes {
    public static void main(String[] args) {

        //This class returns system date without any zone
        //+5:30 from UTC asia calcutta
        LocalDate systemDate = LocalDate.now();
        System.out.println("System Date without zone info "+systemDate);

        //This class returns system time without any zone
        //+5:30 from UTC asia calcutta
        //time has nanosecond precision
        LocalTime systemTime = LocalTime.now();
        System.out.println("System Time without zone info "+systemTime);

        //This class returns system date & time without any zone
        //+5:30 from UTC asia calcutta
        //time has nanosecond precision
        LocalDateTime systemDateTime = LocalDateTime.now();
        System.out.println("System Date and Time without zone info "+systemDateTime);

        //This class returns system date & time with its set zone
        //+5:30 from UTC asia calcutta
        //time has nanosecond precision
        ZonedDateTime systemDateTimeWithZone = ZonedDateTime.now();
        System.out.println("System Date and Time with zone info "+systemDateTimeWithZone);

        //will give system timestamp with milliSecond precision
        //its is the time instant passed since midnight of january 1st 1980
        //Also called as epoch date
        Instant instant = Instant.now();
        System.out.println("System TimeStamp "+instant);

        //This class is used to find difference between times
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime then = LocalDateTime.of(1989,6,12,18,16);
        Duration duration = Duration.between(then, now);
        System.out.println("The time difference between two instants "+duration);

        //This class is used to find difference between dates
        LocalDate today = LocalDate.now();
        LocalDate thatDay = LocalDate.of(1989,6,12);
        Period period = Period.between(thatDay, today);
        System.out.println("The date difference between two instants "+period);

        //This class converts date of any format into date time
        String zonedDateTime = "2009/12/16 13:18:12 EST"; //any format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z"); //matching string date format
        ZonedDateTime formattedDateTime = ZonedDateTime.parse(zonedDateTime, format);
        System.out.println("Date time in specified format "+formattedDateTime);
    }
}