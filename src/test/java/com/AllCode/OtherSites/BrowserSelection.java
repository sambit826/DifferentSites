package com.AllCode.OtherSites;


	

	import java.awt.Desktop;
	import java.io.IOException;
	import java.net.URI;

	public class BrowserSelection {
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
		public static void browserValue(String browser) {
			try {
			       // getDataFromExcelSheet("Sheet1");
			        

			        if (browser.equalsIgnoreCase("chrome")) {
			            String scriptPath = "src\\test\\resources\\Chrome.ps1";
			            String command = "src\\test\\resources\\powershell.exe -ExecutionPolicy Bypass -File " + scriptPath;
			            Runtime.getRuntime().exec(command);
			        } else if (browser.equalsIgnoreCase("edge")) {
			            String scriptPath = "src\\test\\resources\\edge.ps1";
			            String command = "src\\test\\resources\\powershell.exe -ExecutionPolicy Bypass -File " + scriptPath;
			            Runtime.getRuntime().exec(command);
			        } else if (browser.equalsIgnoreCase("Firefox")) {
			            String scriptPath = "src\\test\\resources\\Firefox.ps1";
			            String command = "src\\test\\resources\\powershell.exe -ExecutionPolicy Bypass -File " + scriptPath;
			            Runtime.getRuntime().exec(command);
			        } else {
			            URI uri = new URI("https://www.google.com/");
			            Desktop.getDesktop().browse(uri);
			        }}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Issue with Browser value");
				
			}}

	}

