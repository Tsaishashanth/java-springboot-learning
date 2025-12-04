package Oops;

public class Object {
    public static void main(String[] args) {
        //object = An entity that holds data (attributes)
        //         and can perform actions
        //         it is a reference data type
        // we store the object data in the heap

        Car car = new Car ("yes", 3); //here since because int oops package we have car class this is not giving error
        Object obj = new Object(); //object instance from the same class

        System.out.println(car.name);
        System.out.println(car.year);
        System.out.println(car.isRunning);

        //changing values
        car.isRunning = false;

        //calling the methods
        car.start();

        //Array objects


    }
}
