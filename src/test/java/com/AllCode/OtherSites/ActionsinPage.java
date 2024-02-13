package com.AllCode.OtherSites;


	

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.IOException;
	import java.net.URISyntaxException;
	import java.util.List;

	import javax.net.ssl.SSLHandshakeException;

	import org.jsoup.Jsoup;
	import org.jsoup.nodes.Document;
	import org.jsoup.nodes.Element;

	public class ActionsinPage extends BrowserSelection {
		int count;
		//int count=1;
		public   void ScrollForRandomTime(int Stime) throws AWTException {
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
		 public  void FalseClickInBase(String SearchUrl,  List<String> urls, String browser, int Stime) throws Exception {
				//System.out.println("Entered into False Click Method");
			 count=1;
		    		Thread.sleep(2000);
		    		ScrollForRandomTime(Stime);
		    		System.out.println("Page is scrolling");
				
					System.out.println("Checking blocks");
				 /*Robot robot = new Robot();
				Document PageData=Jsoup.connect(SearchUrl).get();
				Element Reqdata=PageData.getElementsByAttributeValue("class", "chapternav-label05").first();
				System.out.println(Reqdata);
				 System.out.println("Entered into try block of base page");*/
				 try {
					 Robot robot = new Robot();
						Document PageData=Jsoup.connect(SearchUrl).get();
						Element Reqdata=PageData.getElementsByAttributeValue("class", "chapternav-label05").first();
						System.out.println(Reqdata);
						 System.out.println("Entered into try block of base page");
					 System.out.println("Entered into try block of base page");
				if(Reqdata!=null) {
	      robot.keyPress(KeyEvent.VK_ENTER);
				      robot.keyRelease(KeyEvent.VK_ENTER);
				      //System.out.println("Entered into try block of base page");
				     }
				else {
					System.out.println("Clicking Action can't happen as no element found");
				}}
				  catch(Exception e ){
					  System.out.println("Entered into catch block of base");
					 
					 }
				 for(String url:urls) {
					  FalseClickInRef(url,browser, Stime);
				  }
				  
		    	}
		    	
		    	
		 public  void FalseClickInRef(String url,String browser, int Stime) throws AWTException, IOException, InterruptedException, URISyntaxException {
			
				Thread.sleep(2000);
				
				System.out.println("Page is scrolling");
				
			browserSelectiontoOpenUrl(browser,url);
			ScrollForRandomTime(Stime);
			
				try{
					Robot robot = new Robot();
			count++;
			System.out.println("Count is:"+count);
				Document PageData=Jsoup.connect(url).get();
 Element Reqdata=PageData.getElementsByAttributeValue("class", "chapternav-label05").first();

				System.out.println(Reqdata);
				if(Reqdata!=null) {
					//System.out.println("Entered ");
				      robot.keyPress(KeyEvent.VK_ENTER);
				      robot.keyRelease(KeyEvent.VK_ENTER);
				      System.out.println("Entered try block of ref page");
				  }}
				catch(Exception e) {
					System.out.println("Entered into catch block of ref");
					//e.printStackTrace();
					
				}}
			
	}
	


