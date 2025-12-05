package Oops;

public class Object {
    public static void main(String[] args) {
        //object = An entity that holds data (attributes)
        //         and can perform actions
        //         it is a reference data type
        // we store the object data in the heap

        Car car = new Car ("yes", 3); //here since because int oops package we have car class this is not giving error
        Object obj = new Object(); //object instance from the same class
        //this basically means rhs-> new object() creates a car in memory so obj is car
        //lhs object obj ->is just a box, box is labled as animal ,it can hold any object tha is an animal so we can only use Object methods

        System.out.println(car.name);
        System.out.println(car.year);
        System.out.println(car.isRunning);
        //System.out.println(Car); //this gives hashcode to instead to print this we use tostring

        //changing values
        car.isRunning = false;

        //calling the methods
        car.start();

        //Array objects
        //Car car = new Car[]; not allowed
        Car car1 = new Car("supra", 2);
        Car car2 = new Car("viper", 4);
        Car car3 = new Car("charger", 5);

        //we can write like this also
        Car[] arrcar = {car1, car2, car3};
        Car[] anocar = {new Car("supra", 2),
        new Car("supra", 2),
        new Car("supra", 2)
        };


        for(Car item: arrcar) {
            System.out.println(item.name);
        }


    }
}
