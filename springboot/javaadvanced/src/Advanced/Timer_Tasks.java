package Advanced;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_Tasks {
    public static void main(String[] args) {
        //timer = worker ,timertasks = work you want the timer to do
        //timer = class that schedules tasks at specific times or periodical
        //        usefull for: sending notifications, scheduled updates, repetitive actions

        //Timertask = Rerpresents the task taht will be executed by the timer
        //            you will extend the timertask class to define your task  //we are doing this using anynoumous class
        //            create a subclass of Timertask and @override run()

        Timer timer = new Timer();  //
        TimerTask task = new TimerTask(){   //this means what to do            //so for timerTask classes we use anonymoussclasses
            @Override
            public void run(){
                System.out.println("Hello"); // if we want to print it after 3 seconds we use timertasks
            }
        };

        timer.schedule(task, 30,3000);   //so this prints hello after delay of 3000seconds ,30 is milliseconds delay again


    }
}
