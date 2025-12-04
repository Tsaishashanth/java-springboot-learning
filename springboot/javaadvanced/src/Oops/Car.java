package Oops;

public class Car {

    String name = "dodge charger";
    int year = 2016;
    String condition = "good";
    boolean isRunning = true;
    String used;
    int owners;


    //methods
    void start(){
        isRunning = true;
        System.out.println("you start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("you stop the engine");
    }
    //constructor calling

    Car(String used, int owners) {
        this.used = used;
        this.owners = owners;
    }

}
