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

        sc.close();//we have to close the scanner whenever we are done
    }
}
