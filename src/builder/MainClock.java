package builder;

import java.util.ArrayList;
import java.util.List;
import java.time.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainClock extends Thread{
    private volatile List<displays> displaysList = new ArrayList<>();
    private volatile boolean running = true;
    private LocalTime timePoint;
    public volatile int min;
    public volatile int sec;


    public synchronized void addDisplay(displays someDisplay) {
        displaysList.add(someDisplay);
    }


    public synchronized void removeDisplay(displays someDisplay) {
        displaysList.removeIf(displays -> displays.equals(someDisplay));
    }


    public void run() {
        {
            while (running) {
                try {
                    timePoint = LocalTime.now();
                    min = timePoint.getMinute();
                    sec = timePoint.getSecond();
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainClock.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void getTime(){
        notifyDisplays();
    }


    public synchronized void stopClock(){
        running = false;
    }


    public synchronized void notifyDisplays(){
        for(displays Display : displaysList){
            Display.update(min,sec);
        }
    }


    //public int returnHours(){
     //   return sec;
    //}

    //public synchronized int returnMinutes(){
    //    return min;
   // }


}
