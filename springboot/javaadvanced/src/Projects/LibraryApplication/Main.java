package Projects.LibraryApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static List<String> Existinguser = new ArrayList<>();
    public static List<String> password = new ArrayList<>();
    public static List<String> Booksname = new ArrayList<>();
    public static List<String> admindata = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select and option: signup / login");


        if(sc.nextLine().equalsIgnoreCase("signup") ) {
            Login_signup.signup(sc);
        }
        else {
            Login_signup.login(sc);      // we have used the classname because static methods belongs to class not objects
        }

    }
}
