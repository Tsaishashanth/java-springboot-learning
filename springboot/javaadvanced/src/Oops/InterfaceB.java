package Oops;

public class InterfaceB implements InterfaceA{
    //this is a child class
    //variable are not needed to be static
    //we can have methods here
    //can create obj and acces the parent reference


    int abc;
    boolean strike;                 //here we are not getting error because this is a child class
    //child variables can have normal type unlike parent

    @Override
    public int show(){
        System.out.println("this is an interface class");
        return 1;
    }
    public boolean isStrike() {
        return strike;
    }

    @Override
    public double check(){
        return 2;
    }

    public static void main(String[] args) {
        //
        InterfaceA a = new InterfaceB(); //obj is intb but methods only in interfaceb cannot be called using a,methods which are in Inta can only be called
        InterfaceB b = new InterfaceB();
//        InterfaceA ab = new InterfaceA ();    //this throws an error because parent class cannot have the obj

        System.out.println(a.show());




    }

}
