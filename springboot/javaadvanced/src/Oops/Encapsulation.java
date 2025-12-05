package Oops;

public class Encapsulation  extends Car{
    //think it like a capsule which encloses the data
    //only that class can be accessed which is protected -> helpfull for the production level code


    private int age = 13;
    private String name = "private";

    //encapsulation prefer in privacy so inorder to acess these variables we need to use methods
    // the below mentioned get,set are called getters and setters methods we use them to acces privated variables
    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public void Setage(int setage) {
        this.age= setage;

    }
    public void Setname(String Setname) {
        this.name = Setname;
    }

    //refer car clas main i have created the obj for this class and explained about encapsulation

}
