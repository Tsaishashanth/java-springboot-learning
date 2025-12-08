package Projects.LibraryApplication;

import java.util.Scanner;

public class LoginUser {
    public static void main(String[] args) {

        Scanner login = new Scanner(System.in) ;

        System.out.println("Enter your login credentials");

        //login credentials
        //Scanner username = new Scanner(System.in) ;
        System.out.println("Enter your username :");

        String username = login.nextLine();
        System.out.println(username + " " + "Database check --> correct data? (yes/no):");
        String confirm1 = login.nextLine();

        if(confirm1.equals("yes")) {
            System.out.println("enter your password :");
            String password = login.nextLine();
            System.out.println(password + " " + "Database check --> correct data? (yes/no):");
            String confirm2 = login.nextLine();

            if(confirm2.equals("yes")) {
                System.out.println("login in succesfull");
            }
            else {
                System.out.println("invalid password");
                System.exit(0);
            }
        }
        else{
            System.out.println("invalid Username");
            System.exit(0);
        }

        //adding menu to the user

        System.out.println("Please select one option from the menu");
        System.out.println("---");
        System.out.println("Get available books");
        System.out.println("books enrolled");
        System.out.println("---");

        String choice = login.nextLine();

        switch(choice) {
            case "Get available books" -> System.out.println(" These are the available books");
            case "books enrolled" -> System.out.println("These are the books you have enrolled");
            default -> System.out.println("invalid option");
        }
    }
}
