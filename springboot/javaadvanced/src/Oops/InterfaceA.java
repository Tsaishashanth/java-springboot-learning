package Oops;

public interface InterfaceA {

    //interfaces are same line abstraction
    //interfaces uses implements
    //interfaces cannot have objects
    //interfaces cannot have return methods the child should interit the properties
    //all methods in interfaces are abstract methods by default and varible but striclty they should be static and final
    //interfaces cannot have constructors -> cannot create objects directly
    //method in child class must be public(cannot reduce the visibility)

    int age = 2;
    int number =5;

    int show();

    double check();
}
