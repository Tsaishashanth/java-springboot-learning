package Projects.LibraryApplication;

import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        //admin login

        Scanner admin = new Scanner(System.in);

        System.out.println("Enter your Login Credentials");

        System.out.println("Enter your username");
        String username = admin.nextLine();

        System.out.println("Database check --> correct data (yes/no) :");
        String store1 = admin.nextLine();

        if(store1.equals("yes")) {
            System.out.println("Enter your Password");
            String password = admin.nextLine();

            System.out.println("Database check --> correct data (yes/no) :");
            String store2 = admin.nextLine();

            if(store2.equals("yes")) {
                System.out.println("login succesfull");
            }
            else{
                System.out.println("invalid password");
                System.exit(0);
            }
        }
        else{
            System.out.println("Invalid Username");
            System.exit(0);
        }

        // now for admin we have to showcase options

        System.out.println("please select one option from the menu");
        System.out.println("---");
        System.out.println("Add book");
        System.out.println("Delete book");
        System.out.println("Assign book");
        System.out.println("sell book");
        System.out.println("---");

        String choice = admin.nextLine();

        switch(choice) {
            case "Add book" -> System.out.println("Enter the book name to add in the list");
            case "Delete book" -> System.out.println("Enter the book name to delete");
            case "Assign book" -> System.out.println("select the book to assign to user");
            case "Sell book" -> System.out.println("select book to sell");
            default -> System.out.println("Invalid option");

        }

    }
}
