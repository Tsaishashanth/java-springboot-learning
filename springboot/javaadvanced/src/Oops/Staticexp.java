package Oops;

public class Staticexp {
    //we use static when we need the variable to be counted
    //it is commonly used for utility methods or shared resources

    //int friends;
    static int friends;
    String name;
    int rollno;

    Staticexp(String sendname, int sendrollno){
        this.name = sendname;
        this.rollno = sendrollno;
        friends++;
    }
    //methods can also be static
    static void showfriends(){   //you dont need a method to call the static object
        System.out.println("you have" + friends + "friends");
    }


    public static void main(String[] args) {
        Staticexp student1 = new Staticexp("arjun", 1);
        Staticexp student2 = new Staticexp("arjun", 1);

//        System.out.println(student1.friends);
//        System.out.println(student2.friends);

        System.out.println(Staticexp.friends);//it is suggested to use static with the class itself rather than the object
        Staticexp.showfriends();

        // here this will print 1 and 1 for different students and the data is stored as one for two objects

        //but when we use static for the variable it will add no matter which object is linked to
    }
}
