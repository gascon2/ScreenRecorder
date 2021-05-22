/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScreenRecorder;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author goryl
 */
public class ScreenRecorder {public static void main(String[] args) throws AWTException, IOException {

List<BufferedImage> imageList = new ArrayList<>();

Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
Robot robot = new Robot();

File file = new File("outputVideo.mp4");

System.out.println("getting screen images...");

 int count = 0;

        while (count < 100) {

            BufferedImage image = robot.createScreenCapture(screenRect);
            imageList.add(image);

            count++;

        }

        makeVideoFromImages(imageList,file);

    }

    /**
     * @param args the command line arguments
     */
    

    private static void makeVideoFromImages(List<BufferedImage> imageList, File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
