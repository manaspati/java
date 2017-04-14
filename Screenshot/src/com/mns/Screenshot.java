package com.mns;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Screenshot {
	
	public static void main(String[] args) {
		try{
			new TakeScreenshot("a.jpg").getScreenshot(5);
			
		}catch(Exception e){
			
		}
	}

}


 class TakeScreenshot {

    private final String path;

    public TakeScreenshot(String path) {
        this.path = path;
    }

    public void getScreenshot(int timeToWait) throws Exception {
        Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        Robot robot = new Robot();
        BufferedImage img = robot.createScreenCapture(rectangle);
        ImageIO.write(img, "jpg", new File(path));
    }
}
