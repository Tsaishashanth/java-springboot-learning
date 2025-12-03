package Basics;

public class Methods {
    public static void main(String[] args) {
        //method = a block of reusable code that is executed when called ()
        //passing arguments
        String name = "java";
        int age = 30;

        coding(name, age); // here we are passing arguments , need not to mention types

    }
    static void coding(String name, int age) {  //names can be anything but we have to mention type  //here the viod should be static (doubt)
        System.out.printf("i like debugging the bugs in %s and it is %d years old",name, age);
    }

    //overload methods -> methods that share same name but different parameters
    //this is also oops concept  compile time polymorphism -> which tells in compile time only
    static double add ( double a, double b) { // same method but different paramets
        return a + b;
    }
    static double add (double a , double b , double c) {
        return a + b+ c;
    }

}
