package Oops;

public class MethodOverride extends Car {
    //method overriding = when subclass has it own implementation of a method this is already defined
    // means when we extend the classes and the methods are same , and if we want to print the perticular method we write @override above that method
    @Override
    void ride() {
        System.out.println("this statements prints when it is called");
    }
    public static void main(String[] args) {
        MethodOverride obj = new MethodOverride();

        Car obj1 = new MethodOverride();

        obj.ride();   // calls overridden method
        obj1.ride();

        // output is
//        empty parameters   //empty Car() call since child has super
//        empty parameters
//        this statements prints when it is called
//        this statements prints when it is called

        //because we extended the car class and child class has super so it prints by default
        //eventhough we didnt write super in our class , since out parent has another extended class with super so it calls by default
    }
}
