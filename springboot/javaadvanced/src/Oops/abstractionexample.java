package Oops;

public abstract  class abstractionexample {

    abstract double area();  // abstract methods have no body so child must write the code for them and this doesnt return

    //abstract clases can have variables , but they are not forced to be final and static like the interfaces

    double canhave() { //abstract classes can have normal methods too
        return 0;
    }



    public static void main(String[] args) {

        abstractionexample s = new abstraction(20, 10); // this is correct becuase the obj belong sto abstraction

        System.out.println(s.area()); // this gives the correct output and it gives 200


    }

}
