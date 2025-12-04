package Oops;

public class Car {

    String name = "dodge charger";
    int year = 2016;
    String condition = "good";
    boolean isRunning = true;
    String used;
    int owners;
    String engine;



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

    Car(String name, int owners) {
        this.name = name;
        this.owners = owners;

    }
    Car(String engine,int owners, String used) {
        this.engine = engine;
        this.owners = owners;
        this.used = used;
    }

}
