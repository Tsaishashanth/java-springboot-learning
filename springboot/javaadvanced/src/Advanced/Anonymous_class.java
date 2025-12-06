package Advanced;

import Oops.Car; //imported form package

public class Anonymous_class extends Car{

    // the main use case of anonumouse class is To override a method only for one specific object.
    //add custom behaviour without creating a new class like from main , here we created a class for example

    Anonymous_class() {
        super("example", 2);
        System.out.println("we have to use super by default because the car class has default constructor");
    }

    public static void main(String[] args) {
        //anonymousclass = a class that doesnt have a name. cannot be reused
        //

        Car thar = new Car(){
            @Override                           //this overridden method runs only for the object where we have override it.
            public  void ride(){                //doubt --> why we have to call public here
                System.out.println("this is the use case of anonymouse class");
            }
        };
        thar.ride(); // doubt --> why it is giving error when we protect the ride class
    }
}
