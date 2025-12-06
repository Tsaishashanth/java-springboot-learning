package Advanced;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        //exceptions = an event that interups the normal flow of a program
        //             (dividing by zero, file not found, mismatch input type)
        //              sourround any dangerous code with a try{} block
        //              we mainly use try{}, catch{}, finally{}

        System.out.println(1 /0);  //we know that this is an error but what if we dont know so we use the below methods

        try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e){  //here the doubt is how to decide what type of error and what we have to write in catch, we have to write what ever the runtime error popsup
            System.out.println("we cannot divide by zero");
        }

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter a number");
            int number = sc.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e) {
            System.out.println("this wasnt  a number ");
        }

        catch(Exception e) {
            //safety net
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("this always executes");
        }
        sc.close();

    }
}
