package Basics;
/* we use scanner when we want to
* taking numbers from the user
* program needs to ask the user for some information*/
import java.util.Scanner;

public class testscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //this syntax means it takes input from the user
        System.out.println("enter your name:");

        String name = sc.nextLine();//in terminal this shows the next line //but this doesnt do anything so we use this
        System.out.println("hello " + name);

        System.out.println("enter your age:");
        int age = sc.nextInt();

        System.out.println("are you student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("enter your gpa:");
        double gpa = sc.nextDouble();



        System.out.println(name + " " + age + " " +gpa + " " + isStudent);


        //area of triangle example code

        double length = 0;
        double breadth = 0;
        double area =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter length here");
        length = scanner.nextDouble();

        System.out.println("enter breadth");
         breadth = scanner.nextDouble();

        double result = 0.5 * length * breadth;
        System.out.println("area of triangle is: " + result);

        sc.close();//we have to close the scanner whenever we are done
    }
}
