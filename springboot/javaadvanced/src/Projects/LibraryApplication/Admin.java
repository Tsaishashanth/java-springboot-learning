package Projects.LibraryApplication;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Main{

    public static void adminmenu(Scanner sc) {
        System.out.println("Choose option: Add/Delete/Assign/Sell");
        String choice = sc.nextLine().toLowerCase();

        System.out.println("You selected: " + choice);
        System.out.println("please select one option from the menu");
        System.out.println("---");
        System.out.println("Add book");
        System.out.println("Delete book");
        System.out.println("Assign book");
        System.out.println("sell book");
        System.out.println("---");


        switch(choice) {
            case "Add book" -> System.out.println("Enter the book name to add in the list");
            case "Delete book" -> System.out.println("Enter the book name to delete");
            case "Assign book" -> System.out.println("select the book to assign to user");
            case "Sell book" -> System.out.println("select book to sell");
            default -> System.out.println("Invalid option");
        }
    }

    public static void main(String[] args) {

    }
}
