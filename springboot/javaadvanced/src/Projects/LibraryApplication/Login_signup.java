package Projects.LibraryApplication;

import java.util.Scanner;



public class Login_signup extends Main{

    //in this class lets create login in and sign up
    public static void signup(Scanner sc) {

        System.out.println("Enter your username");
        String store1 = sc.nextLine();

        Existinguser.add(store1);

        System.out.println("Enter you password");
        String store2 = sc.nextLine();

        password.add(store2);

        System.out.println("singnup succesfull");

    }
    public static void login(Scanner sc) {

        System.out.println("Enter your username");
        String store1 = sc.nextLine();

        if(!Existinguser.contains(store1)) {
            System.out.println("Invalid credentials");
            System.exit(0);
        }

        System.out.println("Enter your password");
        String store2 = sc.nextLine();

        if(!password.contains(store2)) {
            System.out.println("invalid password");
        }
        System.out.println("Select an option : admin/user");
        admindata.add(sc.nextLine());

        System.out.println("login Succesfull");
    }

//    public static boolean isadmin(Scanner sc) {
//        if(isadmin.contains(adminname)) {
//            return true;
//        }
//        return false;
//    }


}
