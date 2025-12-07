package Advanced;

public class Multithreading {
    //extended version of threading
    //enables a program to run multiple threads concurrently
    //usefull for background tasks or time-consuming operation

    //since we already have the Runnable_threading class lets use that
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable_threading("ping"));
        Thread thread2 = new Thread(new Runnable_threading("pong"));

        thread1.start();
        thread2.start();

        System.out.println("this is the main thread and the other multiple threads are running simultaneously");

        System.out.println("GAME STARTS !");  //here since all threads are running simultaniously we will have simultaneous output if we want group by out we use this

        thread1.start();
        thread2.start();

        thread1.join(); //this will join and then the next thread will join and after these main thread will print
        thread2.join(); // this basically says to main thread that wait i am running after this you can continue


        //gameoverwill print lasts
        System.out.println("GAME ENDS !");
    }

}
