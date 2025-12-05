package Oops;

public class Polymorphism  extends Car{
    // polymorphism in java is only used for two things
    // method overriding and method onverloading
    int noof;

    Polymorphism(){
        super("poly", 2);
//        System.out.println("we use super here because out parent class has a default constructor");
    }

    void bark(){
        System.out.println("dog barks(child class)");
    }

    int showcase(int noof) {
        this.noof = noof;
        return noof;
    }

    public static void main(String[] args) {
        //method overriding  -> runtime polymorphism
        //parent reference can hold chid object and child overriden method runs

        Car a = new Polymorphism();
        a.bark();

        //method overloading  -> compile time error - decision is taken by the compiler like which method and which parameter method show be passed
        //samemethod name different parameters
        System.out.println(a.showcase("david"));
        //in this example the parent class and child class both have the showcase method but different parameters
        //since a is parent reference it checks only parent class method and prints it , it does in compile time so it is called compile time polymorphsm


    }

}
