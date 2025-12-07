package Advanced;

import java.util.Scanner;

public class Threading {
    //basically a thread means a small unit of execution inside the program,it lets a program do multiple tasks by running different sequences
                //this class and the Runnable_threading class

    // allows a program to tun multiple tasks simultaneously
    // helps improve performance with time-consuming operations
    //

    // how to create a thread
    //option-1 -> extend the thread class(simpler)
    //option-2 -> implement the runnable interface(better)
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        Runnable_threading runthread = new Runnable_threading("");  //so this is the obj right
//        Thread thread1 = new Thread(new Runnable_threading());  --> we can write like this also
        Thread thread = new Thread(runthread);

        //->we use thread.setdeaemon before thread.start because one thread starts it doesnt recognizes
        thread.setDaemon(true);  //this things stops when the main thread is done //this class is the main thread

        thread.start();   //doubt -->  didnt understand why we wrote this ,like start() is the default method?: yes

        //so now the two threads are running at the same thime , the problem is this waits for the user input and after 10 seconds that prints the timsup so we use this for solution




        System.out.println("you have a 5 seconds to enter the name");
        System.out.println("ENTER YOUR NAME: ");

        String name = scanner.nextLine();
        System.out.println("hello " + name);
        scanner.close();
    }

}
