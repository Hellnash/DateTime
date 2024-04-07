import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateTimeMethod {

    public static void main(String[] args) {

        //LOCAL DATE, LOCAL TIME and LOCAL DATETIME
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current System Date/Time"+currentDateTime);
        LocalDateTime specifiedDateTime = LocalDateTime.of(1298, 8,17,18,46,45);
        System.out.println("Set Date/Time"+specifiedDateTime);
        LocalDateTime lastDecade = LocalDateTime.now().minus(10, ChronoUnit.DECADES);
        System.out.println("Previous Date Time as per the amount and unit "+lastDecade);
        LocalDateTime afterTenMinutes = LocalDateTime.now().plusMinutes(10);
        System.out.println("Future Date Time as per the amount and unit "+afterTenMinutes);
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = LocalDateTime.now().minusDays(1);
        if (today.isAfter(yesterday)){
            System.out.println("Today is after yesterday");
        }
        if (yesterday.isBefore(today)){
            System.out.println("Yesterday is before today");
        }

        //ZONED DATETIME
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("All available Zones across the globe");
        zoneIds.forEach(System.out::println);
        ZonedDateTime currentDateTimeWithZone = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Current System Date/Time with Zone "+currentDateTimeWithZone);
        ZonedDateTime convertedZonedDateTime = ZonedDateTime.parse("1982-06-08T13:18:20z[Asia/Singapore]");
        System.out.println("String converted to zoned Date/Time "+convertedZonedDateTime);
        ZonedDateTime singaporeTime = ZonedDateTime.now(ZoneOffset.of("+08:00"));
        System.out.println("Other zone date/time in offset "+singaporeTime);

        //DURATION AND PERIOD
        Duration quarterMinutes = Duration.of(15, ChronoUnit.MINUTES);
        System.out.println("15 minutes of duration "+quarterMinutes);
        Duration myDuration = Duration.between(LocalTime.now(), LocalTime.of(12, 18, 41));
        System.out.println("Time between my time and that time "+myDuration);
        Duration sixteenHours = Duration.ofHours(16);
        System.out.println("Duration of hours "+sixteenHours);
        Period age = Period.of(17,16,51);
        System.out.println("Time since I was born "+age);
        Period wifeAge = Period.between(LocalDate.parse("1996-06-16"), LocalDate.of(2023,11,19));
        System.out.println("Time between my wife birth and she become mother "+wifeAge);
        Period nineMonths = Period.ofMonths(9);
        System.out.println("My Wife Pregnancy Duration "+nineMonths);
    }
}
