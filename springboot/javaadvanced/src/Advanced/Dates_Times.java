package Advanced;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates_Times {
    public static void main(String[] args) {
        //how to work with DATES&TIMES using java
        //(localdate, localtime, localdatetime, utc timestamp)

        LocalDate date = LocalDate.now(); //here instead of .now we can do when everwe want using .of()
        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.of(18, 20, 30);  // using .of we can measure
        LocalDateTime datetime = LocalDateTime.now();
        Instant instant = Instant.now(); //gives utc military time,date

        System.out.println(date); //gives date
        System.out.println(time); //gives time
        System.out.println(datetime); //gives both date and time in oneline

        //if we want to change the format we use these syntax

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        String newdatetime = datetime.format(format);
        System.out.println(newdatetime);

        //we can check is before or after or leapyear using this syntax
        if(time.isAfter(time2)) {
            System.out.println(time + "is after " + time2);
        }
        else if(time.equals(time2)) {
            System.out.println(time + "is equlal to " + time2);
        }
    }
}
