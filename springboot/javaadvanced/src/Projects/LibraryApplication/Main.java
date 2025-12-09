package Projects.LibraryApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //here in the main lets create a list which contains usernames and passwords
        List<String> Existinguser = new ArrayList<>();
        List<String> password = new ArrayList<>();
        List<String> Newuser = new ArrayList<>();
        List<String> Booksname = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        //checking whether the user is new user or existing user
        System.out.println("Enter your username");
        String username = sc.nextLine();

        if (Existinguser.contains(username)) {
            System.out.println("Enter your password");
            String pass = sc.nextLine();

            if (password.contains(pass)) {
                System.out.println("Login successful");

            } else {
                System.out.println("Invalid password");

            }
        } else {
            System.out.println("Invalid username");

        }
    }
}
