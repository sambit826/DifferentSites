package com.AllCode.OtherSites;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SearchClearClose  extends ActionsinPage{
	
	public  void OpenNewLink(String SearchUrl,String link,String browser,int Stime, List<String> urls) throws IOException, URISyntaxException, InterruptedException, AWTException {
		try {
		Robot r1=new Robot();
		browserSelectiontoOpenUrl(browser,link);
		System.out.println("in openlink");
		System.out.println(browser);
		/*Desktop.isDesktopSupported();

	      Desktop.getDesktop().browse(new URI(link));}*/
	        Thread.sleep(5000);
	        	Thread.sleep(1000);
	        	//ScrollForRandomTime(Stime);
	        	 FalseClickInBase(SearchUrl, urls, browser, Stime);
	        	  
	}
		catch(Exception e) {e.printStackTrace();
			System.out.println("OpenNewLink method couldn't get executed");
		}
		
	}
	public  void PassValueToSearchBox( String SerachKeyword,String SearchUrl,String browser,int Stime, List<String> urls) throws AWTException, InterruptedException, IOException {
		try {
				        Robot robot = new Robot();
				        Thread.sleep(4000);
				        Thread.sleep(5000);
				        for (char c : SerachKeyword.toCharArray()) {
				            robot.delay(1000);
				            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
				            robot.delay(2000);
				            robot.keyPress(keyCode);
				            robot.keyRelease(keyCode);
				        }
				        robot.keyPress(KeyEvent.VK_ENTER);
				        robot.keyRelease(KeyEvent.VK_ENTER);

				        Thread.sleep(5000);

				        Document searchPageDoc = Jsoup.connect("https://www.google.com/search?q=" + SerachKeyword).get();
		 Elements searchResults = searchPageDoc.select("div.g");
				       

				        for (Element result : searchResults) {
				            Element titleElement = result.selectFirst("h3");
				            Element linkElement = result.selectFirst("a");

				            if (titleElement != null && linkElement != null) {
				                String title = titleElement.text();
				                String link = linkElement.attr("href");
				                robot.delay(1000);
				               // System.out.println(link);
				               // System.out.println(SearchUrl);
				               if (link.equalsIgnoreCase(SearchUrl)) {
				            	   System.out.println(link);
					                System.out.println(SearchUrl);
				                    OpenNewLink(SearchUrl,link,browser, Stime,urls);
				                   // FalseClickInBase(SearchUrl,null, browser,Stime);
				                    		                    break;
				                } else {
				                    System.out.println("Couldnt find matched link");
				                }
				            }

				        }}     catch(Exception e) {
				        	e.printStackTrace();
				        	System.out.println("error in executeTest method");
				        


			}
			}
			 public void  ClearCookiesAndCache() throws AWTException, InterruptedException {
				 //int count;
			 
			    	try {
					System.out.println("it will clear the cookies and cache of the browser");
					Thread.sleep(1000);
					Robot r1=new Robot();
			    	r1.keyPress(KeyEvent.VK_CONTROL);
			    	r1.keyPress(KeyEvent.VK_SHIFT);
			    	r1.keyPress(KeyEvent.VK_DELETE);
			    	r1.keyRelease(KeyEvent.VK_CONTROL);
			    	r1.keyRelease(KeyEvent.VK_SHIFT);
			    	r1.keyRelease(KeyEvent.VK_DELETE);
			    	r1.delay(2000);
			    	r1.keyPress(KeyEvent.VK_ENTER);
			    	r1.keyRelease(KeyEvent.VK_ENTER);
			    	count=1;
			    	while(count>=0) {
			    		System.out.println(count);
			    	r1.keyPress(KeyEvent.VK_CONTROL);
					r1.keyPress(KeyEvent.VK_W);
				    r1.keyRelease(KeyEvent.VK_CONTROL);
				    r1.keyRelease(KeyEvent.VK_W);
				    r1.delay(1000);
				    count--;}
			    	System.out.println("cleared Cookies and cache");}
			    	catch(Exception e) {
			    		e.printStackTrace();
			    		System.out.println("ClearCookiesAndCache Method got failed");
			    	}
			    		
			    	}
			 
			 public void ClosingBrowserPages() throws AWTException {
				 System.out.println("Count in ClosingBrowserPages is:"+count);
					try {
					System.out.println("All opened tabs will be closed now");
					//Robot r2=new Robot();
					Robot r=new Robot();
					System.out.println(count);
					while(count>0) {
					System.out.println(count);
					r.keyPress(KeyEvent.VK_CONTROL);
					r.keyPress(KeyEvent.VK_W);
				    r.keyRelease(KeyEvent.VK_CONTROL);
				    r.keyRelease(KeyEvent.VK_W);
				    r.delay(1000);
				    count--;
				    
				    
					System.out.println("Closing ");
					
					// TODO Auto-generated method stub
					}
					
					}
					catch(Exception e) {
						System.out.println("ClosingBrowserPages method got failed");
						e.printStackTrace();
						
						
					}
				}
			    	
			


}
