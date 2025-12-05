package Oops;

public class InterfaceB implements InterfaceA{

    int abc;
    boolean strike;                 //here we are not getting error because this is a child class
    //child variables can have normal type unlike parent

    @Override
    public int show(){
        System.out.println("this is an interface class");
        return 1;
    }
    public double check(){
        return 2;
    }

    public static void main(String[] args) {
        //
        InterfaceA a = new InterfaceB(); //obj is intb but methods only in interfaceb cannot be called using a
        InterfaceB b = new InterfaceB();
//        InterfaceA ab = new InterfaceA ();    //this throws an error because parent class cannot have the obj

        System.out.println(a.show());
        //here in interfaces every method is abstract method so , methods in a == methods in b so a obj can access both



    }

}
