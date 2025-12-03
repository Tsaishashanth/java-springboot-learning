package Basics;
// enhanced switches are replacement of many ifelse statements (java 14 feature)
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day of the week");

        String day = scanner.nextLine();

        switch(day) {
            case "monday" -> System.out.println("It is a weekday");
            case "Tuesday" ->System.out.println("It is a weekday");
            case "wednesday" -> System.out.println("It is a weekday");
            case "thurday" -> System.out.println("It is a weekday");
            default -> System.out.println(day + "is not a day");
        }
        //simpler version of the above code is this
        switch(day) {
            case "monday","tuesday","wednesday","thursday","friday" ->
                    System.out.println("it is a weekday");

            case "saturday", "sunday" ->
                    System.out.println("it is a weekend");

            default -> System.out.println(day + "is not a day");
        }
    }
}
