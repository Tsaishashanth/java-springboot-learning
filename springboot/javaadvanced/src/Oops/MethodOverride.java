package Oops;

public class MethodOverride extends Car {
    //method overriding = when subclass has it own implementation of a method this is already defined
    // means when we extend the classes and the methods are same , and if we want to print the perticular method we write @override above that method
    boolean alive ;
    @Override
    void ride() {
        System.out.println("this statements prints when it is called");
    }
    MethodOverride(){  // defalut name should be class name only
        super("we use super ",3);                   //since because we have used super it wont print the default one
    }
    public static void main(String[] args) {
        MethodOverride obj = new MethodOverride();

        Car obj1 = new MethodOverride();

        obj.ride();   // calls overridden method
        obj1.ride();

        // output is(without super)
//        empty parameters   //because this class doesnt have constructor  so obj constructor call
//        empty parameters   // not obj1 constructer calls ie Car()
//        this statements prints when it is called -> override method
//        this statements prints when it is called  -> override // doesnt matter with the reference method override is override

        //even though if our class doesnt have super , it print the parent class default constructor because its child have super

        //output -(with super)
//        this statements prints when it is called
//        this statements prints when it is called



    }
}
