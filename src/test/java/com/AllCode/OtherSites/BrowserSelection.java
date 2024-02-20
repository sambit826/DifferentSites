package com.AllCode.OtherSites;


	

	import java.awt.Desktop;
	import java.io.IOException;
	import java.net.URI;

	public class BrowserSelection {
		//BROWSERSELECTIONTOOPENURL:TO CONTIBUE NEXT ACTIONS IN THE OPENED BROWSER(IF NOT ACTIONS WILL RUN IN DEFAULT BROWSER)
		public  void browserSelectiontoOpenUrl( String browser,String link) {
			try {
				  String[] command = {"cmd", "/c", "start", browser, link};

		          // Execute the command
		          Process process = new ProcessBuilder(command).start();

		          // Optionally, you can wait for the process to finish
		          int exitCode = process.waitFor();
		          System.out.println(browser+" browser opened with exit code: " + exitCode);
			} catch (IOException | InterruptedException e) {
		        e.printStackTrace();
		    }
		}
		//BROWSERvalue: TO OPEN THE REQUIRED BROWSER
		public static void browserValue(String browser) {
			
			try {
			       // getDataFromExcelSheet("Sheet1");
			        

			        if (browser.equalsIgnoreCase("chrome")) {
			        	OpenBrowseWithPowerShell("src\\test\\resources\\Chrome.ps1");
			           System.out.println("We are in chrome browser");
			        } 
			        else if (browser.equalsIgnoreCase("Microsoft edge")) {
			        	OpenBrowseWithPowerShell("src\\test\\resources\\edge.ps1");
			            System.out.println("We are in edge browser");
			        } 
			        else if (browser.equalsIgnoreCase("Firefox")) {
			        	OpenBrowseWithPowerShell("src\\test\\resources\\Firefox.ps1");
			              System.out.println("We are in firefox browser");
			        } else {
			        	openDefaultBrowser("https://www.google.com/");
			           
			        }
			        }
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Issue with Browser value");
				
			}}
		public void NetworkDisable() throws Exception {
			String command = "src\\test\\resources\\powershell.exe -ExecutionPolicy Bypass -File " + "src\\test\\resources\\NetworkDisable.ps1";
	          Process process=  Runtime.getRuntime().exec(command);
	          process.waitFor();
	          System.out.println("network disable");
		}
		public void NetworkEnable() throws Exception {
			String command = "src\\test\\resources\\powershell.exe -ExecutionPolicy Bypass -File " + "src\\test\\resources\\NetworkEnable.ps1";
	          Process process=  Runtime.getRuntime().exec(command);
	          process.waitFor();
	          System.out.println("network enable");
		}
			private static void OpenBrowseWithPowerShell(String scriptPath)throws Exception{
				 String command = "src\\test\\resources\\powershell.exe -ExecutionPolicy Bypass -File " + scriptPath;
		          Process process=  Runtime.getRuntime().exec(command);
		          process.waitFor();}
			
	private static void openDefaultBrowser(String url) {
		try {
	
		
	            URI uri = new URI(url);
	            Desktop.getDesktop().browse(uri);
	            System.out.println("We are in default browser");
	}
catch(Exception e) {
	e.printStackTrace();
}
	}}

