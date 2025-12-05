package Oops;

public class abstraction extends abstractionexample {

    int length;
    int breadth;

    abstraction(int a, int b) {
        this.length = a;
        this.breadth = b;
    }

    @Override // not needed here but we use to know the errors
    double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        //abstraction is used to define abstract classes and methods
        //hiding implementation details and showing only essential features
        //abstract classes cant be instantiated like -> Car car = new Car() - this gives an error if car is abstract class
        //can contain 'abstract' methods (which must be implemented)
        // can contain 'concrete' methods (which are inherited)

//        shape s = new shape (); // gives an error


    }
}
