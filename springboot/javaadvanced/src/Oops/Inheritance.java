package Oops;

public class Inheritance {
    public static void main(String[] args) {
        // inheritance = one class inherits the attributes and methods from another class child <- parent
        // here we have taken animal and car class for example


        //parent class only can create obj of child class -> upcasting
         Car c2 = new Animal();
         //here obj is animal but we can only use Car methods
         //c2.stay();
//         Animal a2 = new Car("test", 3); //this gives an error

        Animal a1 = new Animal();  //child class'

        Car c1 = new Car("yes",2); //parent class

        System.out.println(a1.isalive);  //answer is true
        a1.stay();

//  child class can use parent methods
        //parent class cannot use child methods

        //both cannot control constructors we use super for child to obey


    }
}
