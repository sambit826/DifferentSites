package com.AllCode.OtherSites;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ScrollTime {
	public  static void ScrollForRandomTime(int Stime) throws AWTException {
		Robot r1=new Robot();
		long startTime = System.currentTimeMillis();
	    long endTime =  (startTime + (Stime * 1000));
		 while (System.currentTimeMillis() < endTime) {
		        r1.keyPress(KeyEvent.VK_DOWN);
		        r1.keyRelease(KeyEvent.VK_DOWN);
		        r1.delay(1000);
		        r1.keyPress(KeyEvent.VK_DOWN);
		        r1.keyRelease(KeyEvent.VK_DOWN);
		       
		        }
		  
	}
		

}
