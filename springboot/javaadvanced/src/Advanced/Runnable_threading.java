package Advanced;

// since we are using this for threading - meaning running multiple programs at a time , we use runnalble to implement because it has defalut run() method

public class Runnable_threading implements  Runnable{

    // then reason we wrote run() here because by default runnable is an interface , and void run() exsists in that interface so we have to override it
    @Override
    public void run(){
        for(int i=1;i<= 5; i++ ) {

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("thread was interupted");
            }
            if(i ==5 ) {
                System.out.println("time is up");
                //for main we have written the thred.deamon if we wnat to finish in time no matter what we will use this
                System.exit(0); //this will exit the program in 5sec no matter what
            }
        }
    }
}
