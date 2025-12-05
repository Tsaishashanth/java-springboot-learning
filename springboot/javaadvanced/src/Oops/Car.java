package Oops;

public class Car {  //inheritance extended animal class

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
    @Override  //we use override here to warn java we are overidng // we use this because we if want to print car() it will give error so this will override
    public String toString(){
        return this.name + this.owners;   //here we get this when we call soutcar(); java calls toString by default so no constructor needed to pass this code

    }
    Car(String engine,int owners, String used) {
        this.engine = engine;
        this.owners = owners;
        this.used = used;
    }
    Car(){
        System.out.println("empty parameters");
    }
    void ride(){//this is example for method override
        System.out.println("riding");
    }

}
