package Oops;

public class Constructor {
    //constructor = special method to initialize objects
    //              you can pass arguments to a constructor
    //              and set up initial values
    public static void main(String[] args) {
        Car car1 = new Car("yes", 2);
        Car car2 = new Car("yes", 3);

        System.out.println(car1.owners);
        System.out.println(car2.used);

    }

}
