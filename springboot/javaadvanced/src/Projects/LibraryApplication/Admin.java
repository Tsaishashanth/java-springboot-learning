package Projects.LibraryApplication;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {

    static List<String> Existinguser = new ArrayList<>();
    static List<String> password = new ArrayList<>();
    static List<String> Newuser = new ArrayList<>();

    public static boolean login(Scanner sc) {
        System.out.println("Enter your username");
        String username = sc.nextLine();

        if (Existinguser.contains(username)) {
            System.out.println("Enter your password");
            String pass = sc.nextLine();

            if (password.contains(pass)) {
                System.out.println("Login successful");
                return true;
            } else {
                System.out.println("Invalid password");
                return false;
            }
        } else {
            System.out.println("Invalid username");
            return false;
        }
    }

    public static boolean newUser(Scanner sc) {
        System.out.println("Create username");
        String u = sc.nextLine();
        Newuser.add(u);
        Existinguser.add(u);

        System.out.println("Create password");
        String p = sc.nextLine();
        password.add(p);


        System.out.println("User created!");
        return true;
    }
    public static void check(Scanner sc) {

    }

    public static void showmenu(Scanner sc) {
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
        Scanner sc = new Scanner(System.in);

        Existinguser.add("shashanth");
        Existinguser.add("david");
        Existinguser.add("rahul");

        System.out.println("Are you existing or new user?");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase("existing")) {
            if (!login(sc)) return;
        } else {
            newUser(sc);
        }

        showmenu(sc);
    }
}
