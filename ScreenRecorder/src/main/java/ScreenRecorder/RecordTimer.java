/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScreenRecorder;

/**
 *
 * @author goryl
 */
public class RecordTimer { 
    private static long startTime;

   
    private static long stopTime;



    
    public static void reset() {
    
        startTime = 0;
        stopTime = 0;
    }

    

    public static void start() {
        startTime = System.currentTimeMillis();
    }

    
    public static void stop() {
        stopTime = System.currentTimeMillis();

    }

    
    public static long getTimeInMilliSec() {
        return stopTime - startTime;
    }
    
   
    public static long getTimeInSec() {
        return (stopTime - startTime)/1000;
    }


    public static long getTimeInMin() {
        return (stopTime - startTime)/(60*1000);
   }
    
}
