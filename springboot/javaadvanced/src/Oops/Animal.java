package Oops;

public class Animal extends Car {
    int lives = 9;

    boolean isalive;

    Animal() {//since we have extended the car class and in that constructers have parameters so we will get error , to debug it we use super

        super("default car", 2);// now when we have used super the error is gone since because car doesnt have empty construtor super comes into play
        // the reason we use super is we have extended the car class so when we create an animal obj ,java must create a Car part first and car has parameter
//        Steps Java follows:
//        Call parent Car constructor first
//
//        Then call child Animal constructor
//
//        Finally create the full Animal object

        //the default car is only used when we create an obj of animal and call animal() constructor

        isalive = true;
    }

    void eat() {
        System.out.println("The animal is eating");
    }

    void stay() {
        System.out.println("wild animals will remain in forest");

    }

}
