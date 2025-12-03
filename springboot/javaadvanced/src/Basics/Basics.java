package Basics;
//how java code gets executed
//sourcecode -> javac -> bytecode
public class Basics {
    public static void main(String[] args) {
        System.out.println("starting my basic java from here");
        System.out.println("this is the basic working of main method");

        //printf concept

        String name = "spongbob";
        char firstletter = 's';
        int age = 30;
        double height = 60.5;
        boolean isemployed = false;

        System.out.printf("hello %s\n", name);
        System.out.printf("name starts with %c\n", firstletter);
        System.out.printf("you are  %d years old\n", age);
        //for double we use %f, %b for boolean

        System.out.printf("%s id %d years old", name,age);
        //precision

        double price = 100.15;
        System.out.printf(" %f\n", price); //here it give 6 digits after . so we use precision
        System.out.printf(".1%f\n", price); //gives only 1 digit after decimal
        System.out.printf("+.2%f\n", price); //gives +and 2 digits after decimal
        System.out.printf("4%d\n", age); //gives 4 spaces to digits like 1 - ---1
        //( if we add this, it puts negative numbers in this bracket , if we add space it puts

    }
}

//single lined comment
/* multilined comment syntax*/