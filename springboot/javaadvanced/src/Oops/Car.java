package Oops;

public class Car {  //inheritance extended animal class

    String name = "dodge charger";
    int year = 2016;
    String condition = "good";
    boolean isRunning = true;
    String used;
    int owners;
    String engine;
    String call;



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
    @Override  //we use override here to warn java we are overidng
    public String toString(){// we use this because we if want to print car() it will give error so this will override
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
    void bark(){
        System.out.println("dog barks(parent class)");
    }
    int showcase(String call) {
        this.call = call;
        return 5;


    }
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation(); // we are using this example to show case encapsulation from encapsulation class
        //en.age = 5; // we cant chage the age because it is an private variable

        //the only way to acess them are using the method from their class
        en.getAge();
        en.getName();
        //this prints output and this is the only way we can access them

        //if we want to modify name,age we have to use methods
        en.Setage(5);
        en.Setname("private");

    }
}
