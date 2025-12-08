package Projects.LibraryApplication;

import java.util.Scanner;

public class Admin_CodeRefactoring {

    public static boolean login(Scanner sc) {  //instead of creating the scanner again we pass sc to the method

        System.out.println("Enter your username");
        String username = sc.nextLine();

        System.out.println("Database check --> correct data (yes/no):");
        if (!sc.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Invalid username");
            return false;
        }

        System.out.println("Enter your password");
        String password = sc.nextLine();

        System.out.println("Database check --> correct data (yes/no):");
        if (!sc.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Invalid password");
            return false;
        }

        System.out.println("login successful");
        return true;
    }

    public static void showmenu(Scanner sc) {       // we use static so methods can be called directly from main without creating an object
        System.out.println("Please select one option:");
        System.out.println("Add book");
        System.out.println("Delete book");
        System.out.println("Assign book");
        System.out.println("Sell book");

        String choice = sc.nextLine().toLowerCase();

        switch (choice) {
            case "add book" -> System.out.println("Enter book name to add");
            case "delete book" -> System.out.println("Enter book name to delete");
            case "assign book" -> System.out.println("Select book to assign");
            case "sell book" -> System.out.println("Select book to sell");
            default -> System.out.println("Invalid option");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!login(sc)) {
            System.out.println("Login failed");
            return;   //just return means stop the main from now
        }

        showmenu(sc);
    }
}
