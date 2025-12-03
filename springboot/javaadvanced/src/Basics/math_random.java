package Basics;
import java.util.Random;

public class math_random {
    public static void main (String[] args) {
        //random topic
        Random random = new Random();

        int number;

        number = random.nextInt(1, 6); //so random may give a big number so we use range 1, 6 means 1 to 5

        System.out.println(number);

        //math topic
        System.out.println(Math.PI); // gives 3.14
        System.out.println(Math.pow(2, 1)); // this is for exponential power and it is double
        System.out.println(Math.abs(-5)); //absolute value = 5
        //Math.sqrt -> sqaureroot
        //Math.round -> nearest integer 4.1 - 4 checks .5 above or below
        //Math.ceil -> 4.1 - 5 // always upper
        //math.floor -> 4.99 - 4 // always lower
    }
}
