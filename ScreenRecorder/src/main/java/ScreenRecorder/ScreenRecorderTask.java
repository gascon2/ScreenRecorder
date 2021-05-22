/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScreenRecorder;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author goryl
 */
public class ScreenRecorderTask  {

    //declare variables
    AWTSequenceEncoder encoder;

    Robot robot;
    Rectangle screenDimension;
    
    BufferedImage image;
   
    public ScreenRecorderTask(AWTSequenceEncoder sequenceEncoder, Rectangle rectangle) {
    
        encoder = sequenceEncoder;
        screenDimension = rectangle;
       
        try {
            robot = new Robot();
        } catch (AWTException ex) {

            Logger.getLogger(ScreenRecorderTask.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        RecordTimer.start();

    }

    public void run() {
               
        System.out.println("encoiding...");
        image = robot.createScreenCapture(screenDimension); //capture current screen
        encoder.encodeImage(image); //encoding image files
    }
}

    
    
    
    

    
    
    
 
