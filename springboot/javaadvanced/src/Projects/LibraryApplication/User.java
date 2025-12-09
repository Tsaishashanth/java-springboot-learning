package Projects.LibraryApplication;

import java.util.Scanner;

public class User extends Main{
    public static void usermenu(Scanner sc) {
        System.out.println("Please select one option from the menu");
        System.out.println("---");
        System.out.println("Get available books");
        System.out.println("books enrolled");
        System.out.println("---");

        String choice = sc.nextLine();

        switch(choice) {
            case "Get available books" -> System.out.println(" These are the available books");
            case "books enrolled" -> System.out.println("These are the books you have enrolled");
            default -> System.out.println("invalid option");
        }
    }
    public static void main(String[] args) {


    }
}
